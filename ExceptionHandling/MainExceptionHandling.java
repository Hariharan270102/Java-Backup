import java.util.*;
class Demo
{
void myFunction(int a,int n2,int size,String str) throws Exception
{
a=10;
int arr[]=new int[5];
if(str==null)
{
throw new NullPointerException();
}
else
{
System.out.println(str.length());
if(n2==0)
{
throw new ArithmeticException();
}

for(int i=0;i<size;i++)
{
arr[i]=++i;
}
for(int i=0;i<size;i++)
{
System.out.println(arr[i]);           
}
}
}

} 
class MainExceptionHandling 
{ 
public static void main(String[]args) 
{ 
Demo obj=new Demo(); 
try 
{ 
//obj.myFunction(5,5,5,null);
obj.myFunction(5,0,5,"hi");
} 
catch(Exception e) 
{ 
System.out.print(e);
}
}
} 







