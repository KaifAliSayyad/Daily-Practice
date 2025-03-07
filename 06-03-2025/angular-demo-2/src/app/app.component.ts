import { Component } from '@angular/core';
import { EmployeeComponent } from "./components/employee/employee.component";
import { LifeCycleComponent } from "./life-cycle/life-cycle.component";

@Component({
  selector: 'app-root',
  imports: [EmployeeComponent, LifeCycleComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular-demo-2';
  condition = false;
  toggle() {
    this.condition =!this.condition;
  }
}
