package ua.univer.lesson07;

import java.util.Stack;

public class MyStack2<E> extends Stack<E> implements IMyStack<E>{
    public MyStack2() {
        super();
    }

    @Override
    public E push(Object item) {
        return super.push((E)item);
    }

    @Override
    public synchronized E pop() {
        return super.pop();
    }

    @Override
    public synchronized E peek() {
        return super.peek();
    }


}
