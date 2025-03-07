import { Injectable } from '@angular/core';
import { LoggerServiceService } from './logger-service.service';

@Injectable({
  providedIn: 'root'
})
export class ChatServiceService {

  public messages: string[] =[];

  constructor(private logger: LoggerServiceService) { }

  sendMessage(message: string){
    this.messages.push(message);
    this.logger.log(message);
  }
}
