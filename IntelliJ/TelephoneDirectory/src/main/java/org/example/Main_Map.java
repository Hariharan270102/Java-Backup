package org.example;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Main_Map
{
    public static void main(String[] args) {
        Map map=new LinkedHashMap();
        map.put("AAA","Hari");
        map.put(1,"Hari");
        map.put("AAA","hello");
        map.put("BBB","Raghavi");
        map.put("CCC","Vibes");
        map.put("DDD","Cooker");
        map.putIfAbsent(5,"Sneha");
        System.out.println(map.get("AAA"));
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        Map<Integer,Integer> mapGenrics=new HashMap<>();

        mapGenrics.put(1,2);
        mapGenrics.put(2,3);
        mapGenrics.put(3,4);
        mapGenrics.put(4,5);
        mapGenrics.put(5,6);
        mapGenrics.get(mapGenrics.entrySet());
        mapGenrics.get(4);
        mapGenrics.get(2);
        mapGenrics.putIfAbsent(2,4);
        mapGenrics.put(7,7);
        mapGenrics.remove(7);
        mapGenrics.putIfAbsent(7,14);


        mapGenrics.get(map.entrySet());
        mapGenrics.get(map);

        for(Object obj:map.keySet())
        {
            System.out.println(map.get(obj));
        }
        for(Object obj:mapGenrics.keySet())
        {
            System.out.println(mapGenrics.get(obj));
        }













    }
}
