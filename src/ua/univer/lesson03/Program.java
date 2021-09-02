package ua.univer.lesson03;

import java.util.Objects;

class Ship {
    private String name;
    private int x;
    private int y;

    public Ship(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return name.equals(ship.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", hash = "+hashCode()+
                '}';
    }
}

public class Program {
    public static void main(String[] args) {
        Ship[] ships = {
                new Ship("A", 1, 2),
                new Ship("B", 2, 3),
                new Ship("Odessa", 1, 20)
        };

        Ship shipOdessa = new Ship("Odessa", 1, 2);
        System.out.println(shipOdessa);
        for (Ship ship: ships) {
            System.out.println(ship.equals(shipOdessa));
            System.out.println(ship);
        }

        String nameOdessa = new String("Odessa");
        String [] shipNames = {"A","B","Odessa"};
        for (String name: shipNames) {
            System.out.println(name.equals(nameOdessa));
        }

    }
}
