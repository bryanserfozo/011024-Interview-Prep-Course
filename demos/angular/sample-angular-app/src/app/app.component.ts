import { Component } from '@angular/core';
import { GroceryService } from './grocery.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'sample-angular-app';

  // I'll add in a simple variable that we can call
  groceryList:String[] = []

  // To access the service we need to do dependency injection with angular
  constructor(private groceryService: GroceryService){}
  

  // Now we can call the methods inside of our grocery service and use them to render things on the page
  // Angular components have a lifecycle associated with them, so they have different methods we can "hook" into and execute logic when they are called
  ngOnInit(){
    this.groceryList = this.groceryService.getGroceryList();
  }
}
