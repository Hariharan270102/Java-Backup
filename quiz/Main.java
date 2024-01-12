import java.util.*;
class Quiz
{
    int userAnswer[]=new int[10];
    int correctAns[]={1,3,3,2,3,2,1,2,2,4};
    int i=0;
    public void askFn()
    {
        
        System.out.println("1 to play 0 to exit");
        Scanner sc=new Scanner(System.in);
        int selection=sc.nextInt();
        int option;
        if(selection==1)
        {
            switch(selection){
                case 1:
                    System.out.println('''Which of the following statements is correct about inner classes


1.
An inner class can be declared inside a method block called local classes


2.
A static nested class is considered as an inner class


3.
An inner class does not have access to the private members of the outer class


4.
An inner class cannot be declared inside a method''');

System.out.println("Enter choice");
option=sc.nextInt();
userAnswer[i]=option;
i=i+1;
case 2:
    System.out.println('''Which of the following options compares only object references


1.
toString()


2.
equals()


3.
==


4.
hashCode()''');
System.out.println("Enter choice");
option=sc.nextInt();

userAnswer[i]=option;
i=i+1;

            }
        }
        
    }
}


public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		//Quiz q=new Quiz();
		System.out.println("JAVA QUIZ PROGRAM");
		
		
		
		for(int i=0;i<10;i++)
		{
		    System.out.println(correctAns[i]);
		}
		Quiz q=new Quiz();
		
	}
}
