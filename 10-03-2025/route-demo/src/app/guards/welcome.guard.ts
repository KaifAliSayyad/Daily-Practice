import { ActivatedRouteSnapshot, CanActivate, CanActivateFn, RouterStateSnapshot } from '@angular/router';
import { RoleService } from '../services/role.service';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class WelcomeGuard implements CanActivate{

  constructor(private roleService: RoleService){

  }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot){
    if(route.data[0] === this.roleService.getRole()) return true;
    else return false;
  }
}