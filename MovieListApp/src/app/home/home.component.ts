import { Component } from '@angular/core';
import { MaterialModule } from '../material.module';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  imports: [MaterialModule, FormsModule , CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
  standalone: true
})
export class HomeComponent {
  selectedGenre: string = 'all';

  movies = [
    { title: 'Race Gurram', genre: 'Action', rating: 4.2,description:"Race Gurram is a 2014 Telugu-language action-comedy film about two brothers with contrasting personalities: a law-abiding police officer, Ram, and his carefree younger brother, Lucky (Allu Arjun)", poster: 'assets/racegurram.jpeg' },
    { title: 'Geetha Govindham', genre: 'Romance', rating: 4.8,description:"Vijay Govind, a young college lecturer who dreams of marriage falls for Geetha, a level-headed woman who's wary of strangers and isn't easy to convince.", poster: 'assets/GeethaGovindham.jpeg' },
    { title: 'Bahubali2', genre: 'Epic', rating: 4.5,description:"Baahubali 2: The Conclusion is an epic Indian fantasy film that follows the power struggle for the throne of Mahishmati, focusing on the rivalry between the rightful heir Amarendra Baahubali and his jealous cousin Bhallaladeva, who conspires to usurp the kingdom with the help of their mother, Queen Sivagami.", poster: 'assets/bahubali2.jpeg' },
    { title: 'Eega', genre: 'Fantasy', rating: 4.9,description:"Eega is a 2012 Indian fantasy film about a young man, Nani, who is murdered by a wealthy industrialist, Sudeep, for his love interest, Bindu. Nani is reincarnated as a housefly (an eega in Telugu) and uses his new form to exact revenge on Sudeep and protect Bindu.", poster: 'assets/Eega.jpeg' }
  ];

  // get average rating
  get averageRating(): number {
    if (this.movies.length === 0) return 0;
    const total = this.movies.reduce((acc, movie) => acc + movie.rating, 0);
    return +(total / this.movies.length).toFixed(1);
  }

  // get highest rating
  get topRating(): number {
    return Math.max(...this.movies.map(m => m.rating));
  }

  // filter movies by genre
  get filteredMovies() {
    return this.selectedGenre === 'all'
      ? this.movies
      : this.movies.filter(movie => movie.genre === this.selectedGenre);
  }
}