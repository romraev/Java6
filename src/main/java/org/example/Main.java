package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MySet set = new MySet<>();
        set.add(23432);
        set.add(232);
        set.add(432);
        set.add(343);
        set.add("sdkf");
        System.out.println(set);
        set.remove(232);
        System.out.println(set);
        System.out.println(set.get(3));

    }
}
class MySet<T>{
        private Map<T, Object> myset = new HashMap<>();
        private static final Object obj = new Object();

        public boolean add(T value){
            return myset.put(value, obj) == null;
        }

        public boolean remove(T value){
            return myset.remove(value, obj);
        }

        public String get(Integer index){
            return myset.keySet().toArray()[index].toString();
        }
        public String toString(){
            return myset.keySet().toString();
        }
    }