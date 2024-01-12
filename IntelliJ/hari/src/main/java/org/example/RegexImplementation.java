package org.example;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexImplementation {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String a="Hi";
        char i='i';
        System.out.println((int)i); //ascii value
//        System.out.println(Integer.parseInt(a));
        String s=sc.nextLine();
        Pattern p=Pattern.compile("([0-9]{1,3}\\.){3}([0-9]{1,3})");
        Matcher m=p.matcher(s);

        while (m.find()){
            System.out.println(m.group());
        }
    }
}
