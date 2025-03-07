import { Component, Input } from '@angular/core';

@Component({
  selector: 'employee',
  imports: [],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent {

  @Input({required: true, alias: 'username'})
  name: string = 'Guest';

  @Input()
  age: number = 21;

}
