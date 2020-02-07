import java.util.*;
class prob10{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int n;
	int fact=1;
	System.out.println("Enter the value for the factorial");
	n=sc.nextInt();
	if(n>0)
	{ for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
	System.out.println("The factorial of the given number is :"+fact);
	}
	else
	{
		System.out.println(" Pls check the Entry May be it will be nagative");
	}
	
}
}
       
		
		