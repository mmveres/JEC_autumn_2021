package ua.univer.lesson06;

import java.util.ArrayList;
import java.util.List;
class Car{
    private String name;
    private double speed;
}
class Cat{
    private String name;
    private int age;
}
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class Program {
    public static void swap(Product value1, Product value2 ){
        String name = value1.getName();
        value1.setName(value2.getName());
        value2.setName(name);
    }
    public static void main(String[] args) {
      //  testGen();
        Product p1 = new Product("Apple",25);
        Product p2 = new Product("Banana",30);
        swap(p1,p2);
        System.out.println(p1);
        System.out.println(p2);
    }

    private static void testGen() {
        List listObj = new ArrayList();
        listObj.add(1);
        listObj.add(2.0);
        listObj.add("hi");
        listObj.add(new Object());
        System.out.println(listObj);

        List<Integer> listGen = new ArrayList<>();
        listGen.add(1);
        // listGen.add(2.0);
        // listGen.add("hi");
        // listGen.add(new Object());
        System.out.println(listGen);
    }
}
