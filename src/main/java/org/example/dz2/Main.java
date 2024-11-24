package org.example.dz2;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Создать список фильмов (не менее 10 штук) с разными жанрами и годами выпуска и стоимости билета на этот фильм
//        Отфильтровать фильмы, уже выпущенные  (использовать filter). и вывести
//        Отфильтровать фильмы, еще не  выпущенные  (использовать filter). и вывести
//получить новый лист где будут только фильмы цена билета которых выше 1000 руб
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Film film = new Film("Воин", "Боевик", 100.50, 16, LocalDate.of(2025, 8, 30));
        Film film1 = new Film("Гладиатор", "Исторический", 1200.00, 18, LocalDate.of(2021, 5, 15));
        Film film2 = new Film("Интерстеллар", "Фантастика", 300.75, 12, LocalDate.of(2014, 11, 7));
        Film film3 = new Film("Титаник", "Драма", 1500.00, 12, LocalDate.of(1997, 12, 19));
        Film film4 = new Film("Джон Уик", "Боевик", 1400.50, 18, LocalDate.of(209, 5, 17));
        Film film5 = new Film("Человек-паук", "Приключения", 1000.25, 12, LocalDate.of(2021, 12, 17));
        Film film6 = new Film("Мстители", "Фантастика", 2000.00, 12, LocalDate.of(2019, 4, 26));
        Film film7 = new Film("Джокер", "Драма", 900.00, 18, LocalDate.of(2019, 10, 4));
        Film film8 = new Film("Форсаж 9", "Экшн", 1250.40, 16, LocalDate.of(2021, 6, 25));
        Film film9 = new Film("Пираты Карибского моря", "Приключения", 1450.00, 12, LocalDate.of(2007, 5, 25));

        List<Film> filmList = new ArrayList<>();
        filmList.add(film);
        filmList.add(film1);
        filmList.add(film2);
        filmList.add(film3);
        filmList.add(film4);
        filmList.add(film5);
        filmList.add(film6);
        filmList.add(film7);
        filmList.add(film8);
        filmList.add(film9);

        int year= Year.now().getValue();
        System.out.println("------------------Уже выпущенные фильмы---------------------");
        List<Film> releasedFilms = filmList.stream()
                .filter(f -> f.getRelease_date().getYear()<=year)
                .collect(Collectors.toList());

        System.out.println("Уже выпущенные фильмы:");
        releasedFilms.forEach(System.out::println);
        System.out.println("------------------Не выпущенные фильмы---------------------");

        List<Film> dFilms = filmList.stream()
                .filter(f -> f.getRelease_date().getYear()>year)
                .collect(Collectors.toList());

        System.out.println("Не выпущенные фильмы");
        dFilms.forEach(System.out::println);
        System.out.println("-----------------Цена фильма выше 1000 рублей----------------------");
        List<Film> price1000= filmList.stream().
                filter(f->f.getPrice()>1000).
                collect(Collectors.toList());
        price1000.forEach(System.out::println);
    }
}

