import { Component, Input } from '@angular/core';

@Component({
  selector: 'grocery-item',
  templateUrl: './grocery-item.component.html',
  styleUrl: './grocery-item.component.css'
})
export class GroceryItemComponent {

  @Input() name !: String ;
  // Essentially I'm making it so we can receive input from a parent component to dynamically change what is rendered on the screen

}
