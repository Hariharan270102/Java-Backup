package hello;
import java.util.*;
public class UDA_emp_pojo
{
private int eid;
private String eName;
private long sal;

int getId()
{
return eid;
}

String getName()
{
return eName;
} 

long getSalary()
{
return sal;
}

void setId(int id)
{
this.eid=id;
}

void setName(String name)
{
this.eName=name;
}

void setSalary(long sal)
{
this.sal=sal;
}

public String toString()
{
return eid+" "+eName+" "+sal;
}

public void EmpDetails(UDA_emp_pojo... empArr)//obj array ulla varuvan
{
for(UDA_emp_pojo i:empArr)//each obj print aavum adhula irrundhu tostring kulla poitu details print aavum.
{
System.out.println(i);
}
}

}