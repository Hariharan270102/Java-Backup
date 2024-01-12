import java.util.*;
class MultiLevelInheritance_Employee
{
private int eid;
private String eName;
private long sal;
public void setId(int id)
{
this.eid=id;
}
public void setName(String name)
{
this.eName=name;
}
public void setSalary(long sal)
{
this.sal=sal;
}
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

}


class Manager extends MultiLevelInheritance_Employee
{
private String dept;
public void setDept(String dept)
{
this.dept=dept;
}
String getDept()
{
return dept;
}
}

class Admin extends Manager
{
}

class Engineer extends MultiLevelInheritance_Employee
{
}

class Director extends Admin
{
private long budget;
public void setBudget(long budget)
{
this.budget=budget;
}
long getBudget()
{
return budget;
}

}

class Main
{
public static void main(String args[])
{

MultiLevelInheritance_Employee emp_obj;
emp_obj=new Manager();

emp_obj.setId(101);
emp_obj.setName("HARI");
emp_obj.setSalary(1011111111);

System.out.println("ID: "+emp_obj.getId()+"NAME: "+emp_obj.getName()+"SALARY: "+emp_obj.getSalary());

}
}
