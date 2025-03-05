import { Component } from '@angular/core';
import { InterpolationComponentComponent } from "./components/interpolation-component/interpolation-component.component";
import { PropertyBindingComponent } from "./components/property-binding/property-binding.component";
import { EventBindingComponent } from "./components/event-binding/event-binding.component";
import { TwoWayBindingComponent } from "./components/two-way-binding/two-way-binding.component";
import { TestcompComponent } from "./testcomp/testcomp.component";

@Component({
  selector: 'app-root',
  imports: [InterpolationComponentComponent, PropertyBindingComponent, EventBindingComponent, TwoWayBindingComponent, TestcompComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'data-binding';
  condition = false
}
