package ua.univer.lesson06;

import java.util.HashMap;

public class TwoTuple<A,B>{
    public final A first;
    public final B second;
    public TwoTuple(A first, B second){
        this.first = first;
        this.second = second;
    }


    public static void main(String[] args) {
        TwoTuple<Integer, String> twoTupleIS = new TwoTuple<>(1,"A");
        TwoTuple<String, Integer > twoTupleSI = new TwoTuple<>("A",1);
        TwoTuple<String, String > twoTupleSS = new TwoTuple<>("A","B");

      //  HashMap<> hashMap;
    }
}
