import java.util.*;
class prob09{
	public static void main(String[]args){
		int n,rem=0,rev=0;
		System.out.println("Enter the number for Reversing :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(n!=0)
		{   
		    rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
		}
		System.out.println("Reverse number is :"+rev);
	}
}
			