package hello;
import java.util.*;
class UserDefinedArray_Emp
{
int eid;
String eName;
long sal;
UserDefinedArray_Emp()
{}
UserDefinedArray_Emp(int eid,String eName,long sal)
{
this.eid=eid;
this.eName=eName;
this.sal=sal;
}
public String toString()
{
return eid+" "+eName+" "+sal; 
}
public void EmpDetails(UserDefinedArray_Emp...empArray)
{
for(UserDefinedArray_Emp i:empArray)
{
System.out.println(i);
}
}
public static void main(String args[])
{
UserDefinedArray_Emp obj=new UserDefinedArray_Emp();
UserDefinedArray_Emp empArr[]=new UserDefinedArray_Emp[5];
Scanner sc=new Scanner(System.in);
int i,j,k;
for(i=0;i<5;i++)
{
System.out.println("ENTER ID");
int id=sc.nextInt();
System.out.println("ENTER NAME");
String name=sc.next();
System.out.println("ENTER SALARY");
long sal=sc.nextLong();
UserDefinedArray_Emp empObj=new UserDefinedArray_Emp(id,name,sal);
empArr[i]=empObj;

}
obj.EmpDetails(empArr);
}
}