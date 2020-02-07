import java.util.Scanner;
class prob02{
public static void main(String[]args){
	int n1=50,n2=40,n3=23,max;
	max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
	System.out.println("the largest number of the given number "+max);
}
}
