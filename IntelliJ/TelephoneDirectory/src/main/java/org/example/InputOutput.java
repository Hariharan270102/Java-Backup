package org.example;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputOutput {
    public static void main(String[] args) {
        //System.out.println();
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        try{
            //byte n=(byte)isr.read();
            //System.out.println(n);
            String arr=br.readLine();
            System.out.println(arr);
            //System.out.println((char)n);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
