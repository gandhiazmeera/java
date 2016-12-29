package practice;
import java.util.Scanner;
public class StudentDetails 
{
	private static Scanner s;

	public static void main(String args[])
	{
	s = new Scanner(System.in);
	System.out.println("Enter your name");
	String name=s.nextLine();
	System.out.println("Enter your marks");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=s.nextInt();
	int e=s.nextInt();
	int f=s.nextInt();
	float percent=(a+b+c+d+e+f/2)*100;
	System.out.println("Enter your college name");
	String clg=s.next();
	System.out.println("Enter your mobile number");
	String mbl=s.next();
	System.out.println("name:"+name);
	System.out.println("marks:"+a+" "+b+" "+c+" "+d+" "+e+" "+f);
	System.out.println("college name:"+clg);
	System.out.println("mobile number:"+mbl);
	System.out.println("percentage"+percent);
	}
}