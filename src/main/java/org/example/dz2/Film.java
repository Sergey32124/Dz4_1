package org.example.dz2;

import java.time.LocalDate;
import java.util.Date;

public class Film {
    private String name;
    private String genre;
    private double price;
    private int age_limit;
    private LocalDate release_date;

    public Film(String name, String genre, double price, int age_limit, LocalDate release_date) {
        this.name = name;
        this.genre = genre;
        this.price = price;
        this.age_limit = age_limit;
        this.release_date = release_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge_limit() {
        return age_limit;
    }

    public void setAge_limit(int age_limit) {
        this.age_limit = age_limit;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDate release_date) {
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", age_limit=" + age_limit +
                ", release_date=" + release_date +
                '}';
    }
}
