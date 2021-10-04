package ua.univer.lesson11;

import java.util.function.BiFunction;

//interface Operation{
//    int sum(int x, int y);
//    int multy(int x, int y);
//}

//interface OperationFunc<T>{
//    T oper(T x, T y);
//}

public class Program {

    public static void main(String[] args) {

//        Operation op = new Operation() {
//            @Override
//            public int sum(int x, int y) {
//                return x+y;
//            }
//
//            @Override
//            public int multy(int x, int y) {
//                return x*y;
//            }
//        };
//
//        System.out.println(op.sum(2,3));
//        System.out.println(op.multy(2,3));

        BiFunction<Integer,Integer, Integer> sumOp = (x, y) ->  x+y;
        BiFunction<Integer,Integer, Integer> multyOp =  (x, y) -> x*y;
        BiFunction<Integer,Integer, Integer> subOp =  (x, y) -> x-y;


        System.out.println(sumOp.apply(2,3));
        System.out.println(multyOp.apply(2,3));
        System.out.println(subOp.apply(2,3));
    }
}
