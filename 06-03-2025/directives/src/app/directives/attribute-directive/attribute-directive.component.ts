import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'attribute-directive',
  imports: [CommonModule, FormsModule],
  templateUrl: './attribute-directive.component.html',
  styleUrl: './attribute-directive.component.css'
})
export class AttributeDirectiveComponent {
  isItalic: boolean = false;
  isBold: boolean = false;
  color: string = 'white';
  toggleItalic() {
    this.isItalic =!this.isItalic;
  }

  toggleBold() {
    this.isBold =!this.isBold;
  }

}
