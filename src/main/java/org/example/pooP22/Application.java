package org.example.pooP22;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        Film film1 =
                new Film("La Haine", "Matthieu Kassovitz", LocalDate.parse("1995-05-31"), "Drame");
        System.out.println(film1.toString());

        Film film2 =
                new Film();
        film2.setTitle("Avatar 2");
        film2.setDirector("James Cameron ");
        film2.setYear(LocalDate.parse("2022-12-14"));
        film2.setGenre("Action");

        System.out.println(film2.toString());


    }
}
