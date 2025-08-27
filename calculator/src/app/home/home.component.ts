import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  standalone:true,
  selector: 'app-home',
  imports:[  FormsModule],
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  num1: number = 0;
  num2: number = 0;
  result: number | string = '';

  add() {
    this.result = this.num1 + this.num2;
  }

  subtract() {
    this.result = this.num1 - this.num2;
  }

  multiply() {
    this.result = this.num1 * this.num2;
  }

  divide() {
    if (this.num2 !== 0) {
      this.result = this.num1 / this.num2;
    } else {
      this.result = 'Cannot divide by zero';
    }
  }
}
