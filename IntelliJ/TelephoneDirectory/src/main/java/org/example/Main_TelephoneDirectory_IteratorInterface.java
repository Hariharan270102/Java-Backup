package org.example;

import java.util.*;

public class Main_TelephoneDirectory_IteratorInterface {
    Set<TelephoneDirectory> td = new HashSet<>();
    List<TelephoneDirectory> l=new ArrayList<>();
    public void createDirectory()
    {
        TelephoneDirectory t1=new TelephoneDirectory("AAA",1111111111);
        TelephoneDirectory t2=new TelephoneDirectory("BBB",22222222);
        TelephoneDirectory t3=new TelephoneDirectory("CCC",33333333);
        TelephoneDirectory t4=new TelephoneDirectory("DDD",444444444);
        TelephoneDirectory t5=new TelephoneDirectory("EEE",555555555);

        td.add(t1);
        td.add(t2);
        td.add(t3);
        td.add(t4);
        td.add(t5);
        td.add(t1);
        td.add(t2);
        td.forEach(System.out::println);
        l.addAll(td);
    }

    //TelephoneDirectory t = new TelephoneDirectory();

    public void search(String name)
    {
        //l array list
        int flag=0;
        Iterator iteratorObject=td.iterator();
        while(iteratorObject.hasNext())
        {                                                                                 //Iterating hash set using Iterator
            TelephoneDirectory object=(TelephoneDirectory) iteratorObject.next();
            if(object.getName().equals(name))
            {
                System.out.println("Iterator and hash set"+ object);
                flag=1;
                break;
            }

        }
        if(flag==0){
            System.out.println("Name not found!!!!! using Iterator and hash set");
        }
        flag=0;
        System.out.println("Test");
        for(TelephoneDirectory i:l)
        {
            if(i.getName().equals(name)){                                                 //Iterating ArrayList using ForEach loop
                System.out.println("For Each and Array List"+ i);
                flag=1;
                break;
            }

        }
        if(flag==0){
            System.out.println("Name not found!!!!! using for each loop and ArrayList");
        }

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Main_TelephoneDirectory_IteratorInterface m=new Main_TelephoneDirectory_IteratorInterface();
        m.createDirectory();

        System.out.println("*****TELEPHONE DIRECTORY*****");
        System.out.println("Enter name to display respective phone number: ");
        String searchName=sc.next();
        m.search(searchName);




    }
}
