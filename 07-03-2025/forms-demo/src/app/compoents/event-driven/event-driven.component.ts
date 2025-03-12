import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
  

@Component({
  selector: 'app-event-driven',
  imports: [CommonModule],
  templateUrl: './event-driven.component.html',
  styleUrl: './event-driven.component.css'
})
export class EventDrivenComponent {

  submitForm(obj: any): void {
    obj.preventDefault();
    console.log("Event Driven Object");
    const fields = obj.target.elements
    for(const field of fields) {
      if(field.name && field.value) {
        console.log(`${field.name}: ${field.value}`);
      }
    }
  }
}
