import { Component, DoCheck, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'life-cycle',
  imports: [],
  templateUrl: './life-cycle.component.html',
  styleUrl: './life-cycle.component.css'
})
export class LifeCycleComponent implements OnInit, OnChanges, OnDestroy, DoCheck {

  constructor() {
    console.log('Life Cycle Component Constructor');
  }

  ngOnInit(): void {
    console.log('Life Cycle Component OnInit');
  }

  ngDoCheck(): void {
    console.log('Life Cycle Component DoCheck');
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log('Life Cycle component OnChanges');
  }

  ngOnDestroy(): void {
      console.log('Life Cycle component OnDestroy');
  }
}
