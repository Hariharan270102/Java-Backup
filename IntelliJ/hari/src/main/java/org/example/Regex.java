package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String a="{\"hello\":\"hi\",\"java\":\"world\"}";
        System.out.println(a);
        String b="{\"hello\":\"world\",\"java\":\"world1\"}";
        System.out.println(b);

        Pattern pattern=Pattern.compile("(\\w+)");
        Scanner sc=new Scanner(System.in);
//        String a=sc.nextLine();
//        String b=sc.nextLine();
        Matcher matcher=pattern.matcher(a);
        Matcher matcher1=pattern.matcher(b);
        ArrayList<String> al=new ArrayList<>();
        ArrayList<String> al1=new ArrayList<>();

        while(matcher.find()){
            al.add(matcher.group(1));
//            System.out.println(matcher.group(1));

        }
        while(matcher1.find()){
            al1.add(matcher1.group(1));
//            System.out.println(matcher1.group(1));
        }
        for(int i=0;i<al.size();i+=2){
            String key=al.get(i);
            if(al1.contains(key)){
                if(!al.get(i+1).equals(al1.get(al.indexOf(key)+1))){
                    System.out.println(key);
                }
            }
        }


//        System.out.println(al);
//        if(al.size()==al1.size()){
//            for(int i=0;i<al.size();i=i+2){
//                String key=al.get(i);
//                if(al1.contains(key)){
//                    System.out.println(al.get(i+1)+" "+al1.get(al.indexOf(key)+1));
//                }
//                else{
//                    System.out.println(false);
//                }
//            }
//        }
//        else{
//            System.out.println(false);
//        }

    }
}
