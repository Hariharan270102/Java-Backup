import java.util.*;
class Barn
{
public static void main(String args[])
{
go("hi",1);
go("hi","world",2);
}
public void go(String...s,int x)
{
System.out.print(s[s.length-1]+" ");
}
}