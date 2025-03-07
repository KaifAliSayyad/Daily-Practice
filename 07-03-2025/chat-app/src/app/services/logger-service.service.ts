import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerServiceService {

  constructor() { }

  log(message: string){
    console.log(`[LOGGER] ${message}`);
  }
}
