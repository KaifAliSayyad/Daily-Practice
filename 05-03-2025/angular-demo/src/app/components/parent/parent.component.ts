import { Component } from '@angular/core';
import { ChildComponent } from './child/child.component';
import { SiblingComponent } from '../sibling/sibling.component';
import { AnyOtherComponent } from "../any-other/any-other.component";

@Component({
  selector: 'app-parent',
  imports: [ChildComponent, SiblingComponent, AnyOtherComponent],
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css'
})
export class ParentComponent {

}
