package hello;
import java.util.*;
class AttendanceExtended
{

	public void markAttends()
	{
		System.out.println("Mass Bunk");
	}

	public void markAttends(String... names)
	{
		System.out.println(names.length + " Student Present");
		for(String name:names)		
		{
			System.out.println(name);
		}
	}
	
public static void main(String args[])
{
String ae_arr[]=new String[5];
AttendanceExtended obj=new AttendanceExtended();
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++)
{
String name;

System.out.println("ENTER NAME");
ae_arr[i]=sc.next();

}

if(ae_arr.length==0)
{
	obj.markAttends();
}
else
{
	obj.markAttends(ae_arr);
}


}
}