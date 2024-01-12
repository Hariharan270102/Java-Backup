import java.util.*;
interface DemoInterface1
{
default void display()
{
System.out.println("DemoInterface 1");
}
}

interface DemoInterface2
{
default void display()
{
System.out.println("Demo Interface 2");
}
}                                                                                    
class DemoInterfaceMainClass implements DemoInterface1,DemoInterface2
{
public void display()
{
System.out.println("this program will run!");
}
public static void main(String args[])
{

DemoInterfaceMainClass d=new DemoInterfaceMainClass();
d.display();
}
}




/*

import java.util.*;
interface DemoInterface1
{
default void display()
{
System.out.println("DemoInterface 1");
}
}

interface DemoInterface2
{
default void display()
{
System.out.println("Demo Interface 2");
}
}                                                                                    //this program will give us an error since both interfaces have the same display method and to overcome this situation, we need to override the method.

class DemoInterfaceMainClass implements DemoInterface1,DemoInterface2
{

public static void main(String args[])
{
DemoInterfaceMainClass d=new DemoInterfaceMainClass();
d.display();
}
}

*/	
