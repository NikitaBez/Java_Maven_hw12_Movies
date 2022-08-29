package ru.netology.movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    String movie1 = "Фильм №1";
    String movie2 = "Фильм №2";
    String movie3 = "Фильм №3";
    String movie4 = "Фильм №4";
    String movie5 = "Фильм №5";
    String movie6 = "Фильм №6";
    String movie7 = "Фильм №7";
    String movie8 = "Фильм №8";
    String movie9 = "Фильм №9";
    String movie10 = "Фильм №10";
    String movie11 = "Фильм №11";
    String movie12 = "Фильм №12";
    String movie13 = "Фильм №13";


    @Test
    public void addNewMovie() {
        MovieManager addMovie = new MovieManager();
        addMovie.add(movie1);
        addMovie.add(movie2);
        addMovie.add(movie3);
        addMovie.add(movie4);
        addMovie.add(movie5);


        String[] expected = {movie1, movie2, movie3, movie4, movie5};
        String[] actual = addMovie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseMoviesList() {
        MovieManager addMovie = new MovieManager(10);
        addMovie.add(movie1);
        addMovie.add(movie2);
        addMovie.add(movie3);
        addMovie.add(movie4);
        addMovie.add(movie5);
        addMovie.add(movie6);
        addMovie.add(movie7);
        addMovie.add(movie8);
        addMovie.add(movie9);
        addMovie.add(movie10);
        addMovie.add(movie11);


        String[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        String[] actual = addMovie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTheMaxLength() {
        MovieManager addMovie = new MovieManager(11);
        addMovie.add(movie1);
        addMovie.add(movie2);
        addMovie.add(movie3);
        addMovie.add(movie4);
        addMovie.add(movie5);
        addMovie.add(movie6);
        addMovie.add(movie7);
        addMovie.add(movie8);
        addMovie.add(movie9);
        addMovie.add(movie10);
        addMovie.add(movie11);


        String[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = addMovie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}