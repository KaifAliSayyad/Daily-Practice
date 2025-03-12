import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RoleService {

  private role: string = '';

  public getRole() : string{
    return this.role;
  }

  public setRole(newRole: string) : void{
    this.role = newRole;
  }
}
