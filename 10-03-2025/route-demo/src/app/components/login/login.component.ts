import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { log } from 'node:console';
import { RoleService } from '../../services/role.service';

@Component({
  selector: 'app-login',
  standalone: false,
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  msg: string = '';

  constructor(private router: Router, private roleService: RoleService) {
    //Just for injecting router
  }

  login(event: any) {
    event.preventDefault();
    let uname = event.target.elements[0].value;
    let pwd = event.target.elements[1].value;
    let role = event.target.elements[2].value;
    this.roleService.setRole(role);
    if(uname == pwd){
      this.msg = "Unauthorized access identified!!"
      this.router.navigate(['welcome']);
    }
    else{
      this.msg = "Sorry! Invalid Credentials"
      console.log(this.msg)
      this.router.navigate(['netbanking']);
    }
  }
}
