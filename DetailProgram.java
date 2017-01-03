package practice;
import java.util.Scanner;
public class DetailProgram 
{
public static void main(String aa[])
{
	int	count=0;
	Scanner s=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
	System.out.println("Enter your name");
	String name=s.next();
	System.out.println("enter the age");
	int age =s.nextInt();
	System.out.println("Enter your salary");

	
	
	int sal=s.nextInt();
	if(sal>50000)

	{
		
	count++;	
	
	}
	}
	
	System.out.println("salary greater then 50000" +count);	
	
}
}