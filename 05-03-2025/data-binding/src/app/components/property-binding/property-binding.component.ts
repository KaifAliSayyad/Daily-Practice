import { Component } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  imports: [],
  templateUrl: './property-binding.component.html',
  styleUrl: './property-binding.component.css'
})
export class PropertyBindingComponent {
  name: string = "PropertyBinding";
  isMarried: boolean = false;
  greet(): string { return "Hello" };
}
