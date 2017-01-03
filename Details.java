import java.util.Scanner;
public class Details
{
public static void main(String aa[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter department");
String dept=s.nextLine();
System.out.println("Enter number of employees");
String n=s.nextLine();
System.out.println("enter salaries of employees");
int count=0;
for(int i=0;i<2;i++)
{
int sal=s.nextInt();
if(sal>30000)
{
count++;
}
}
System.out.println(count);
}
}
