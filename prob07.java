import java.util.*;
class prob07{
	public static void main(String[]arg){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		n=sc.nextInt();
		int ln=n%10;
		switch(ln) 
		{    
			case 1:    
			System.out.println("one ");    
			break;    
			case 2:    
			System.out.println("two ");     
			break;    
			case 3:    
		    System.out.println("three");   
			break;    
			case 4:    
			System.out.println("four ");   
			break;    
			case 5:    
			System.out.println("fivr");  
			break;    
			case 6:    
			System.out.println("six ");  
			break;    
			case 7:  
			System.out.println("seven");   
			break;  
			case 8:    
			System.out.println("eaight ");  
			break;    
			case 9:    
			System.out.println("nine ");   
			break;    
			case 0:    
			System.out.println("zero");  
			break;    
			default:    
			System.out.println("jai "); 
			break;    
		}   
		
	}
}