import java.util.*;
class SelectionSort
{
	public static void main(String args[])
	{

	int i,j,k,temp;
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	
	//int min=a[0];

	for(i=0;i<n-1;i++)
	{
	int min=a[i];

	for(j=1;j<n-1-i;j++)
	{
	if(min>a[j])
	{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	
	}
	}



	for(i=0;i<n;i++)
	{
	System.out.println(a[i]);
	}

	
	}

}
