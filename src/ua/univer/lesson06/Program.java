package ua.univer.lesson06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Car implements NameAble{
    private String name;
    private double speed;

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}

class Cat implements NameAble{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Product implements Comparable<Product>, NameAble{
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

    @Override
    public int compareTo(Product o) {
        return (int) (price - o.price);
    }
}

class MyList<MyParamType> {
    private MyParamType list[];
    private int i;

    public MyList() {
        list = (MyParamType[]) new Object[10];
        // list =  new MyParamType[10];
        i = -1;
    }

    public void add(MyParamType value) {
        list[++i] = value;
    }

    ;

    public int length() {
        return i + 1;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "list=" + Arrays.toString(list) +
                ", count=" + length() +
                '}';
    }
}
class ProductSortByName implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class Program {
    public static <T extends Comparable<T>> int countGreaterThan(T elem,T... anArray) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

    public static <T extends NameAble> void swap(T value1, T value2) {
        String name = value1.getName();
        value1.setName(value2.getName());
        value2.setName(name);
    }

//    public static void swap(Cat value1, Cat value2) {
//        String name = value1.getName();
//        value1.setName(value2.getName());
//        value2.setName(name);
//    }
//
//    public static void swap(Car value1, Car value2) {
//        String name = value1.getName();
//        value1.setName(value2.getName());
//        value2.setName(name);
//    }

    public static void main(String[] args) {
        //  testGen();
        Product p1 = new Product("Apple", 125);
        Product p2 = new Product("Banana", 30);
        Product p3 = new Product("PineApple", 155);
        Product p4 = new Product("Mango", 70);
        swap(p1, p2);
        System.out.println(p1);
        System.out.println(p2);

        Product [] products = {p1,p2,p3,p4};
        System.out.println(countGreaterThan(p2,products));

        Arrays.sort(products, new ProductSortByName());

        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Arrays.sort(products, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println(Arrays.toString(products));

        testCat();
        testCar();

        testMyList();


    }

    private static void testMyList() {
        MyList<Object> list = new MyList<>();
        list.add(new Cat("Tom", 9));

        list.add(1);
        list.add(2.0);
        list.add("hi");
        list.add(new Car("Lanos", 199));
        System.out.println(list);

        MyList<Car> listCar = new MyList<>();
        listCar.add(new Car("Lanos1", 199));
        listCar.add(new Car("Lanos2", 199));
        System.out.println(listCar);
    }

    private static void testCar() {
        Car car1 = new Car("Ford", 100);
        Car car2 = new Car("BMW", 120);
        swap(car1, car2);
        System.out.println(car1);
        System.out.println(car2);
    }

    private static void testCat() {
        Cat cat1 = new Cat("Tom", 25);
        Cat cat2 = new Cat("TomLee", 55);
        swap(cat1, cat2);
        System.out.println(cat1);
        System.out.println(cat2);

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
