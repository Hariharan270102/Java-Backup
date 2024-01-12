import java.util.*;
class Vehicle
{
String tyre;
String steering;
public void display(String tyre,String steering)
{
System.out.println(tyre+" "+steering);
}
}

class Car extends Vehicle
{
String ac="AC";
public void display(String tyre,String steering)
{
System.out.println(tyre+" "+steering+" "+ac);
}
}

class VehicleCar
{
public static void main(String args[])
{
Vehicle obj=new Car();
obj.display("MRF","POWER STEERING");
}

}