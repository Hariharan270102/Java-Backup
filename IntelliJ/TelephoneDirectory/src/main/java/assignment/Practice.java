package assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice implements Serializable {
    String name;
    int id;

    public Practice() {
    }

    public Practice(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args)  {
        Practice p=new Practice("hari",101);
        try{
            File p1=new File("Practice.txt");
            p1.createNewFile();
        }
        catch (Exception e){
            System.out.println(e);
        }

        try(FileInputStream fis=new FileInputStream("Practice.txt"); BufferedInputStream bis=new BufferedInputStream(fis);
            FileOutputStream fos=new FileOutputStream("Practice.txt");BufferedOutputStream bos=new BufferedOutputStream(fos);
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            ObjectInputStream ois=new ObjectInputStream(bis);)
        {
            oos.writeObject(p);
            Practice p1 =(Practice) ois.readObject();
            System.out.println(p1);


        }
        catch (Exception e){
            System.out.println(e);
        }

        Integer a[]={1,2,3,4,5};
        List<Integer> l=Arrays.asList(a);
        Object[] b =l.toArray();
        System.out.println(b);
        for (Object i:b
             ) {
            System.out.println(i);

        }


        System.out.println(l);
    }
}
