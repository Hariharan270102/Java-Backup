package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Random50
{
    public static void main(String[] args) {
        List l=new ArrayList();
     //   int a[]=new int[50];
//        Random random_obj=new Random();
//        int sum=0;
//        for(int i=0;i<50;i++){
//            a[i]=random_obj.nextInt(100);
//            if(a[i]%2==0){
//                sum=sum+a[i]*2;
//            }
//        }
        //l= Arrays.asList(a);
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        //System.out.println(sum);
        Object b[] =l.toArray();
        System.out.println(b);
//        int c[]=b;
        System.out.println(l.get(0));
        for(Object i:b){
            System.out.println(i);
        }
        for(int i=0;i<3;i++){
            System.out.println(b[i]);
        }


    }
}
