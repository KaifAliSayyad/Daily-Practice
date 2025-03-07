import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'inbuilt-pipes',
  imports: [CommonModule],
  templateUrl: './inbuilt-pipes.component.html',
  styleUrl: './inbuilt-pipes.component.css'
})
export class InbuiltPipesComponent {
  str: string = 'Hello world!';
  amt: number = 12345;
  date: Date = new Date();
}
