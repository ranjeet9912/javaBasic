import java.util.Scanner;
class prob01{
public static void main(String[]arg)
{
	float input;
	
	int n,full;
	float fra;
   System.out.println("Enter the value for the how many value u want to convert");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
	   input=sc.nextFloat();
	   full=(int)input;
	   System.out.println(full);
	   fra=input-full;
	   System.out.println(fra);
   }
}
}
	   
	   
   