package org.example;

import java.io.*;
import java.util.Scanner;

public class IO_Operations implements Serializable {
    String s="HELLO";

    @Override
    public String toString() {
        return "IO_Operations{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        File f=new File("Hariharan.txt");
        try(FileInputStream fis=new FileInputStream("Hariharan.txt");FileOutputStream fos=new FileOutputStream(f,true); ObjectOutputStream oos=new ObjectOutputStream(fos);)
        {
            //console to file
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            byte arr[]=s.getBytes();
            fos.write(arr);
            //read file
            Scanner s2=new Scanner(f);
            while(s2.hasNext()){
//                String s3= s2.nextLine();
//                for(int i=0;i<s2.length();i++){
//                    System.out.println(s2.charAt(i));
//                }
                System.out.println(s2.next());
            }
//            IO_Operations io=new IO_Operations();
//            oos.writeObject(io);
//            System.out.println("SUCCESS!!!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
