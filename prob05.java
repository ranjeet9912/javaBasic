import java.util.*;
class prob05{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String st="Rahul Tester";
		int sum=0;
		int sm[]=new int[3];
		System.out.println("Enter the value of the marks of got by Rahul tester :");
		for(int i=0;i<3;i++)
		{
			 sm[i]=sc.nextInt();
			sum=sum+sm[i];
			
		}
		float avg=sum/3;
		if(avg>(60*avg/100))
		{
			System.out.println(" St Name:"+st);
		    System.out.println(" Total Marks:"+sum);
			System.out.println(" avg mark Marks:"+avg);
		    System.out.println(" Pass by the First divison :");
		}
	    else if(avg>(40*avg/100))
		{
			System.out.println(" St Name:"+st);
		    System.out.println(" Total Marks:"+sum);
			System.out.println(" avg mark Marks:"+avg);
		    System.out.println(" Pass by the Second divison :");
		}
		else
		{
			System.out.println(" St Name:"+st);
		    System.out.println(" Total Marks:"+sum);
			System.out.println(" avg mark Marks:"+avg);
		    System.out.println(" Sorry ! Try later");
		}
	}	
	
}