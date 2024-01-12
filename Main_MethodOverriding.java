package assignment;
import java.util.*;
class Vehicles
{
Vehicles v=new Vehicles();
String tyre="MRF";
String engine="VOLKSWAGON";
String steering="POWER STEERING";
public void functions()
{
System.out.println("Basic requirements");
}

}

class Car extends Vehicles
{
String Ac="Air Conditioning";
Car obj=new Car();
public void functions()
{
System.out.println("A car has "+obj.tyre+" tyres and "+obj.engine+" engine with "+obj.steering+" along with "+obj.Ac+" features");
}
}

class Main_MethodOverriding
{
public static void main(String args[])
{
Car obj1=new Car();
obj1.functions();
//v.functions();
Vehicles v1=new Vehicles();
v1.functions();

}
}
