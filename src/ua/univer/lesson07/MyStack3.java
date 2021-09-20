package ua.univer.lesson07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyStack3<T> implements IMyStack<T>{
    private List<T> list;
    private int index;
    {
        list= new ArrayList<>();
        index = -1;
    }

    @Override
    public T pop() {
        return list.remove(index);
    }

    @Override
    public T peek() {
        return list.get(index);
    }

    @Override
    public T push(Object value) {
        return list.set(++index, (T) value);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    public List<T> getList() {
        return list;
    }
}
