package practise;
import java.util.Scanner;
public class StudentPercentage 
{
	public static void main(String aa[])
	{
Scanner s=new Scanner(System.in);
String name=s.nextLine();
int s1=s.nextInt();
int s2=s.nextInt();
int s3=s.nextInt();
float avg=(s1+s2+s3)/3;
System.out.println("name:"+name);
System.out.println("marks:"+s1+ " "+s2+ " "+s3);
System.out.println("float avg:"+avg);
if(avg<35)
{
	System.out.println("sagar is failed");
}
else if((avg>35)&&(avg<60))
{
	System.out.println("sagar got B grade");
}
else if((avg>60)&&(avg<80))
{
	System.out.println("sagar got A grade");
}
else if(avg>80)
{
	System.out.println("sagar got A+ grade");
}
}
}