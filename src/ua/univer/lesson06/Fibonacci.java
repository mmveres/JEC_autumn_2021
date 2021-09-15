package ua.univer.lesson06;

public class Fibonacci implements Generator<Integer> {
    private int count;
    @Override
    public Integer next() {
        return ProgramRecursive.factIter(count++);
    }
    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }
    public static void main(String... arg) {
        Fibonacci fib = new Fibonacci();
        for (int i = 0; i < 10; i++) {
            System.out.println("********************");
            System.out.print(fib.next() + " ");
            System.out.println("********************");
        }
    }
}

