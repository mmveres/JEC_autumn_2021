package ua.univer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");
        long l = 3_000_000_000l;

        int x = 1;
        int y = 2;
        double z =  x/y*1.0 ;
        System.out.println(z);

        float f1 = 0.000000000000000000000000000010000001f;
        float f2 = 0.000000000000000000000000000010000002f;
        System.out.println(f1==f2);
    }
}
