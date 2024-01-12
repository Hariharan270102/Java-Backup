package org.example;
import java.util.*;
import java.util.regex.Pattern;


public class JsonString {
    public static void jsonString(String a, String b){
//        {"hello":"hi","java":"world"}
//        {"hello":"world","java":"world"}
//        Pattern p=Pattern.compile("(\\w+\b)");
        String cleana=a.substring(1,a.length()-1);
        String cleanb=b.substring(1,b.length()-1);
        System.out.println(cleana +" "+ cleanb);
        String arr1[]=cleana.split("[,]");
        String arr2[]=cleanb.split("[,]");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        LinkedHashMap<String,String> hashMap=new LinkedHashMap<>();
        LinkedHashMap<String,String> hashMap1=new LinkedHashMap<>();
        for(String i:arr1){
            String kvpair[]=i.split("[:]");
            hashMap.put(kvpair[0].substring(1,kvpair[0].length()-1),kvpair[1].substring(1,kvpair[1].length()-1));
        }
        for(String i:arr2){
            String kvpair[]=i.split("[:]");
            hashMap1.put(kvpair[0].substring(1,kvpair[0].length()-1),kvpair[1].substring(1,kvpair[1].length()-1));
        }
        System.out.println(hashMap);
        System.out.println(hashMap1);
        StringBuffer sb=new StringBuffer();

        if(hashMap1.size()==hashMap.size()){
            for(String k:hashMap.keySet()){
                if(hashMap1.containsKey(k)){
                   sb.append(hashMap.get(k)+" "+hashMap1.get(k));
                }
//
            }
        }
        else{
            System.out.println(false);
        }

        System.out.println(sb);




    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        jsonString(a,b);
    }

}
