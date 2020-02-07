import java.util.*;
class prob08
{
public static void main(String[]arg)
{
	Scanner sc=new Scanner(System.in);
	int sum=0;
	int n;
	System.out.println("Enter the value of of how many entry u want");
	n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		if(a[i]%2!=0)
		{
			sum=sum+a[i];
		}
		
	}
	System.out.println("The Sum of the all Enter value which is on odd position :"+sum);
}
	
}	
	
	
	