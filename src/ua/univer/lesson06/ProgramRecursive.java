package ua.univer.lesson06;

public class ProgramRecursive {
    // 5! =4*3*2*1   n! = n * (n-1)!
    static int countIter;
    static int factRec(int n){
        System.out.println(++countIter);
        if (n == 1 || n== 0) return 1;
        return  n * factRec(n-1);
    }
    static int factIter(int n){
        if (n == 1 || n== 0) return 1;
        int fact =1;
        for (int i = 2; i <= n; i++) {
            System.out.println(++countIter);
            fact*=i;
        }
        return fact;
    }
    // fib(n) = fib(n-1)+fib(n-2)
   static int fibRec(int n) {
        System.out.println(++countIter);
        if (n < 2) return 1;
        return fibRec(n - 2) + fibRec(n - 1);
    }
    static int fibIter(int n){

        if (n < 2) return 1;
        int z=0;
        int y=1;
        int x=1;
        for (int i = 2; i <=n ; i++) {
         //   System.out.println("count="+(++countIter));
            z = y + x;
            x = y;
            y = z;
        }
        return z;
    }

    public static void main(String[] args) {
        countIter =0;
        System.out.println(factRec(15));
        countIter =0;
        System.out.println(factIter(15));

        countIter =0;
        System.out.println(fibRec(10));
        countIter =0;
        System.out.println(fibIter(10));
    }
}
