package ua.univer.lesson07;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

class MyStack<T> implements Iterable<T>, IMyStack<T> {
    private T[] arr;
    private int top;
    public MyStack(){
        arr = (T[]) new Object[10];
        top = -1;
    }
    @Override
    public T pop() {
        T value = arr[top];
        arr[top]=null;
        top--;
        return value;
    }
    @Override
    public T peek(){
        return arr[top];
    }
    @Override
    public T push(Object value){
        arr[++top] = (T)value;
        return (T)value;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>() {
            private int index = - 1;

            @Override
            public boolean hasNext() {
                return  index < top;
            }

            @Override
            public T next() {
                return arr[++index];
            }

            @Override
            public boolean hasPrevious() {
                return index > 0;
            }

            @Override
            public T previous() {
                return arr[--index];
            }

            @Override
            public int nextIndex() {
                return index+1;
            }

            @Override
            public int previousIndex() {
                return index-1;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void set(T t) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void add(T t) {
                throw new UnsupportedOperationException();
            }
        };
    }



    private class MyStackIterator implements Iterator<T>{
        private int index;
        MyStackIterator(){
            index = -1;
        }
        @Override
        public boolean hasNext() {
            return index < top;
        }

        @Override
        public T next() {
            return arr[++index];
        }
    }

//    @Override
//    public Iterator<T> iterator() {
//        return Arrays.stream(arr).iterator();
//    }

}
public class ProgramCollection {
    public static void main(String[] args) {
        IMyStack<Integer> stack = new MyStack3<>();
        stack.push(11);
        stack.push(12);
        stack.push(13);

        for (var value: stack ) {
            System.out.println(value);
        }

       Iterator<Integer> iterator= stack.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
