import { Component } from '@angular/core';

@Component({
  selector: 'app-interpolation-component',
  imports: [],
  templateUrl: './interpolation-component.component.html',
  styleUrl: './interpolation-component.component.css'
})
export class InterpolationComponentComponent {
  name: string = "Hello from Kaif";
  age: number = 1;

  getName(): string { return this.name; } 
  getAge(): number { return this.age; }
}
