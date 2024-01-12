package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEg {
    String name;
    int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public ComparatorEg(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public ComparatorEg() {
    }

    @Override
    public String toString() {
        return "ComparatorEg{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        List<ComparatorEg> al=new ArrayList<>();
        al.add(new ComparatorEg("hari",100));
        al.add(new ComparatorEg("tarun",100));
        al.add(new ComparatorEg("giri",98));
        al.add(new ComparatorEg("madhu",97));
        al.add(new ComparatorEg("sudha",101));
        Collections.sort(al, new Comparator<ComparatorEg>() {
            @Override
            public int compare(ComparatorEg comparatorEg, ComparatorEg t1) {
                if(comparatorEg.getMarks()>t1.getMarks()){
                    return 1;
                }
                else if(comparatorEg.getMarks()< t1.getMarks()){
                    return -1;
                } else if (comparatorEg.getMarks()== t1.getMarks()) {
                    return t1.getName().compareTo(comparatorEg.getName());

                }
                return 0;
            }
        });
        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        Collections.sort(l);
        Collections.reverse(l);
        System.out.println(l);
        l.sort((integer, t1) -> {
            if(integer>t1){
                return 1;
            }
            return -1;
        });
        System.out.println(l);









    }
}
