package ua.univer.lesson04;

public class ProgramSwap {
    public static void swap (Integer x, Integer y){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        Integer z = x; x=y;y =z;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
    public static void swap (int [] arr){
        System.out.println("x = "+arr[0]);
        System.out.println("y = "+arr[1]);
        Integer z = arr[0]; arr[0]=arr[1];arr[1] =z;
        System.out.println("x = "+arr[0]);
        System.out.println("y = "+arr[1]);
    }
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        int []mass = {a,b};
        swap(mass);
        System.out.println( "a ="+mass[0]);
        System.out.println( "b ="+mass[1]);
    }
}
