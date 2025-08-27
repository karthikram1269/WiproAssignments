import { Component } from '@angular/core';
import { MaterialModule } from '../material.module';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

interface Song {
  name: string;
  artist: string;
  album: string;
  duration: string;
  rating: number;
}

@Component({
  selector: 'app-home',
  imports:[MaterialModule, FormsModule , CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
  standalone: true
})
export class HomeComponent {
  selectedFilter: string = 'all';
  filterType: 'artist' | 'album' = 'artist';

  songs: Song[] = [
    { name: 'Blinding Lights', artist: 'The Weeknd', album: 'After Hours', duration: '3:20', rating: 5 },
    { name: 'Shape of You', artist: 'Ed Sheeran', album: 'Divide', duration: '4:05', rating: 4 },
    { name: 'Levitating', artist: 'Dua Lipa', album: 'Future Nostalgia', duration: '3:23', rating: 5 },
    { name: 'Bad Guy', artist: 'Billie Eilish', album: 'When We All Fall Asleep', duration: '3:14', rating: 4 },
    { name: 'Uptown Funk', artist: 'Bruno Mars', album: 'Uptown Special', duration: '4:30', rating: 5 },
  ];

  // get unique artists or albums
  get uniqueFilters(): string[] {
    const values = this.songs.map(song => this.filterType === 'artist' ? song.artist : song.album);
    return Array.from(new Set(values));
  }

  get filteredSongs(): Song[] {
    if (this.selectedFilter === 'all') return this.songs;
    return this.songs.filter(song => 
      this.filterType === 'artist' 
        ? song.artist === this.selectedFilter 
        : song.album === this.selectedFilter
    );
  }
}
