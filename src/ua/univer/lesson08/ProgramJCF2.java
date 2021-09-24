package ua.univer.lesson08;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ProgramJCF2 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap  = new Hashtable<>();
        hashMap.put(1,"one");
        hashMap.put(3,"two");
        hashMap.put(10,"three");
        hashMap.put(17,"four");
        hashMap.put(16,"five");
        hashMap.put(18,"six");

        System.out.println(hashMap);
       Map<Integer, String> syncMap = Collections.synchronizedMap(hashMap);
       ConcurrentHashMap concurrentHashMap;

    }
}
