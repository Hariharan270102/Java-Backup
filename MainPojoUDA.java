package hello;
import java.util.*;
class MainPojoUDA
{
public static void main(String args[])
{

UDA_emp_pojo empArr[]=new UDA_emp_pojo[5];
Scanner sc=new Scanner(System.in);

for(int i=0;i<5;i++)
{
UDA_emp_pojo obj=new UDA_emp_pojo();
System.out.println("ENTER ID");
obj.setId(sc.nextInt());
System.out.println("ENTER NAME");
obj.setName(sc.next());
System.out.println("ENTER SALARY");
obj.setSalary(sc.nextLong());
empArr[i]=obj;
}
UDA_emp_pojo obj1=new UDA_emp_pojo();
obj1.EmpDetails(empArr);

}
}