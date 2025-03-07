import { Component } from '@angular/core';
import { ChatServiceService } from '../../services/chat-service.service';

@Component({
  selector: 'app-person2',
  imports: [],
  templateUrl: './person2.component.html',
  styleUrl: './person2.component.css'
})
export class Person2Component {
  msg: string = '';
  constructor(public cs: ChatServiceService) { };
  sendMessage(msg: string): void {
    this.cs.sendMessage('Person 2: ' + msg);
  }
}
