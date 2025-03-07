import { Component } from '@angular/core';
import { ChatServiceService } from '../../services/chat-service.service';

@Component({
  selector: 'app-person1',
  imports: [],
  templateUrl: './person1.component.html',
  styleUrl: './person1.component.css'
})
export class Person1Component {
  msg: string = '';

  constructor(public cs: ChatServiceService){};
  sendMessage(msg: string): void{
    this.cs.sendMessage('Person 1: '+msg);
  }
}
