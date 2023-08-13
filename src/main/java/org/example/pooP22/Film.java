package org.example.pooP22;


import java.sql.Date;
import java.time.LocalDate;

public class Film {
    private String title;
    private String director;
    private LocalDate year;
    private String genre;

    public Film(){ //default constructor

    }

    public Film(String title, String director, LocalDate year, String genre){
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;


    //getters
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public LocalDate getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //toString


    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }
}
