package ua.univer.lesson11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Country{
    private String name;
    private int count;
    private double square;

    public Country(String name, int count, double square) {
        this.name = name;
        this.count = count;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", square=" + square +
                '}';
    }
}
public class ProgramSort {
    public static void main(String[] args) {
        List<Country> countries = Arrays.asList(
                new Country("A",12,23),
                new Country("C",11,24),
                new Country("D",13,21),
                new Country("B",14,21)
                );
        countries.forEach(country -> System.out.println(country));

        Collections.sort(countries, Comparator.comparingInt(Country::getCount));
        countries.forEach(country -> System.out.println(country));

        Collections.sort(countries, Comparator.comparing(Country::getName));
        countries.forEach(country -> System.out.println(country));

        Collections.sort(countries, (o1, o2) -> {
            if (Double.compare(o1.getSquare(), o2.getSquare()) == 0)
                return o1.getName().compareTo(o2.getName());
            return Double.compare(o1.getSquare(), o2.getSquare());
        });
        countries.forEach(country -> System.out.println(country));

        countries.sort(
                Comparator.comparing(Country::getSquare)
                          .thenComparing(Country::getName)
                          .reversed());
        countries.forEach(country -> System.out.println(country));
    }
}
