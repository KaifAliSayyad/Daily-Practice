import { Component } from '@angular/core';
import { ChatServiceService } from '../../services/chat-service.service';

@Component({
  selector: 'app-person3',
  imports: [],
  templateUrl: './person3.component.html',
  styleUrl: './person3.component.css'
})
export class Person3Component {
  msg: string = '';
  constructor(public cs: ChatServiceService) { };
  sendMessage(msg: string): void {
    this.cs.sendMessage('Person 3: ' + msg);
  }
}
