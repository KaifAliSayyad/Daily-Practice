import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Person1Component } from "./components/person1/person1.component";
import { Person2Component } from "./components/person2/person2.component";
import { Person3Component } from "./components/person3/person3.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Person1Component, Person2Component, Person3Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'chat-app';
}
