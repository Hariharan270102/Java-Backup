package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generics {
    public static void printName(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3 );
        HashMap<Integer,Integer> map1=new HashMap<>();
        map1.putAll(map);
        System.out.println(map);
        System.out.println(map1);
        System.out.println(map1.keySet());
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }


        printName(5);
        ArrayList al=new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        List bl= al.subList(2,5);
        System.out.println(al);
        bl.add(6);
        System.out.println(bl);

        System.out.println(bl.get(0));
    }
}
