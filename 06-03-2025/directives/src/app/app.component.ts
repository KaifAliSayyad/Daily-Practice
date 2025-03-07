import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AttributeDirectiveComponent } from "./directives/attribute-directive/attribute-directive.component";
import { CustomDirectiveComponent } from "./components/custom-directive/custom-directive.component";

@Component({
  selector: 'app-root',
  imports: [AttributeDirectiveComponent, CustomDirectiveComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'directives';
}
