package ua.univer.lesson08;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Ship{
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

    public void setName(String name) {
        this.name = name;
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
        return  Objects.equals(name, ship.name);
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
                ", hash=" + hashCode() +
                '}';
    }
}
public class ProgramSet {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(1);
        integerSet.add(11);
        System.out.println(integerSet);

        Set<Ship> shipSet = new HashSet<>();
        shipSet.add(new Ship("A",1,1));
        shipSet.add(new Ship("B",2,2));
        shipSet.add(new Ship("A",1,1));
        System.out.println(shipSet);

        Ship shipA = new Ship("A",11,11);
        System.out.println(shipA);
        System.out.println(shipSet.contains(shipA));
    }
}
