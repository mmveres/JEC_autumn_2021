package ua.univer.lesson07;

import java.util.Iterator;

class MyStack<T> implements Iterable<T>{
    private T[] arr;
    private int top;
    public MyStack(){
        arr = (T[]) new Object[10];
        top = -1;
    }
    public T pop() {
        return arr[top--];
    }
    public T peek(){
        return arr[top];
    }
    public int push(T value){
        arr[++top] = value;
        return top;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
public class ProgramCollection {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(11);
        stack.push(12);
        stack.push(13);

        for (var value: stack ) {
            System.out.println(value);
        }
    }
}
