import { Directive, HostListener } from '@angular/core';

@Directive({
  selector: '[myEvent]'
})
export class MyEventDirective {

  constructor() { }

  @HostListener('click', ['$event'])
  someLogic() {
    console.log('CLICKED : from Event Directive');
  }
  @HostListener('mouseenter', ['$event'])
  someOtherLogic() {
    console.log('Mouse Entered : from Event Directive');
  }
}
