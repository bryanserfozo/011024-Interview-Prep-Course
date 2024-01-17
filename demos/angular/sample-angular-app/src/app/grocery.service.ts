import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GroceryService {
  // This is the grocery service, it will be in charge of getting the data from the backend
  // To use a service we'll need to inject the service into a component and then call the appropriate methods

  getGroceryList(): String[]{
    // Here is where we'd actually do the calling for the list from the backend, but right now we'll keep it simple
    return ["milk", "cheese", "bread", "steak", "potatoes", "trash bags"]
  }

  constructor() { }
}
