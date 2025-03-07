import { Directive, ElementRef, OnInit } from '@angular/core';

@Directive({
  selector: '[myColor]'
})
export class MyColorDirective implements OnInit {

  constructor(private element: ElementRef) {

  }

  ngOnInit(): void {
    this.element.nativeElement.style.backgroundColor = 'red';
  }


}
