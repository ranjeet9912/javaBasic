import java.util.*;
class prob03{
public static void main(String[] arg){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value for the check the even or odd");
	int a=sc.nextInt();
	String str=(a%2==0)? "even" :"odd";
	System.out.println(str);
}
}

