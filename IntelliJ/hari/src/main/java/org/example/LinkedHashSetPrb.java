package org.example;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetPrb
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s=sc.nextLine();
            LinkedHashSet<String> testSet=new LinkedHashSet<>();
            LinkedHashSet<String> finalSet=new LinkedHashSet<>();
            String[] strArr=s.split(" ");
            System.out.println(Arrays.toString(strArr));
            for(String a:strArr){
                if(!testSet.contains(a.toLowerCase())){
                    testSet.add(a.toLowerCase());

                    finalSet.add(a);
                    System.out.println("testset: "+testSet);
                    System.out.println("finalset: "+finalSet);
                }
            }

            for(String str:finalSet){
                System.out.print(str);
                System.out.print("\t");
            }
            System.out.println(finalSet);

        }

    }
}
