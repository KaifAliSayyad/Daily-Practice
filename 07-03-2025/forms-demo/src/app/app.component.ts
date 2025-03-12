import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TemplateDrivenComponent } from "./components/template-driven/template-driven.component";
import { ReactiveFormsComponent } from "./components/reactive-forms/reactive-forms.component";
import { EventDrivenComponent } from "./compoents/event-driven/event-driven.component";

@Component({
  selector: 'app-root',
  imports: [TemplateDrivenComponent, ReactiveFormsComponent, EventDrivenComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'forms-demo';
  component: string = 'template';

  setTemplate(){
    this.component = 'template';
  }

  setReactive(){
    this.component ='reactive';
  }

  setEvent(){
    this.component = 'event';
  }
}

