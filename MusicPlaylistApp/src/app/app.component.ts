import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CommonModule } from '@angular/common';
import { MaterialModule } from './material.module';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, HomeComponent, CommonModule, MaterialModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MusicPlaylistApp';
}