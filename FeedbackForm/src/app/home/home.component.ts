import { Component, OnInit } from '@angular/core';
import { MaterialModule } from '../material.module';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-home',
  standalone: true, 
  imports: [MaterialModule, ReactiveFormsModule],
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  myFormReact!: FormGroup;

  ngOnInit() {
    this.myFormReact = new FormGroup({
  name: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(10)]),
  email: new FormControl('', [Validators.required, Validators.email]),
  subject: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(40)]),
  comments: new FormControl('', [Validators.required, Validators.minLength(10), Validators.maxLength(350)])
});

  }

  onSubmitReact() {
    if (this.myFormReact.valid) {
      console.log(" Form is valid", this.myFormReact.value);
    } else {
      console.log(" Form is invalid");
      this.myFormReact.markAllAsTouched(); 
    }
  }
}
