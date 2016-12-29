package practice;
import java.util.Scanner;
public class AdditionScanner {
public static void main(String aa[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your a value");
	int a=s.nextInt();
	System.out.println("Enter your b value");
	int b=s.nextInt();
	int c=a+b;
	System.out.println(c);
	
}
}
