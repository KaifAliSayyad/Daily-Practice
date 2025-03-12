import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';



@Component({
  selector: 'app-reactive-forms',
  imports: [FormsModule, ReactiveFormsModule],
  templateUrl: './reactive-forms.component.html',
  styleUrl: './reactive-forms.component.css'
})
export class ReactiveFormsComponent implements OnInit {

  employeeForm: any;  

  ngOnInit(): void {
    this.employeeForm = new FormGroup({
      user: new FormControl("", this.userValidator),
      age: new FormControl(null, Validators.compose([Validators.required, Validators.min(21), Validators.max(65)])),
      salary: new FormControl(25000, Validators.required),
      designation: new FormControl("", this.desigValidator)

    });
  }

  userValidator(control: any) : any{
    if(control.value.length < 5)
      return {user: true};
  }

  desigValidator(control: any) : any{

    if(control.value.length < 5)
      return {designation: true}
  }

  
  submitForm(obj : any): void {
    console.log(obj);
  }

}
