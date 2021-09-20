package ua.univer.lesson07;

import java.util.Iterator;

public interface IMyStack<T> extends Iterable<T>{
    T pop();

    T peek();

    T push(Object value);

    Iterator<T> iterator();
}
