package ua.univer.lesson06;

public class GenMethod {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }
    public static void main(String[] args) {
        GenMethod gm = new GenMethod();
        gm.<String>f("");
//gm.<Integer>f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
