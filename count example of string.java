import java.util.Scanner;
public class WordString1
{
public static void main(String aa[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your string");
String str=s.nextLine();
int count=0;
for(int i=1;i<=str.length();i++)
{
count++;
}
System.out.println(count);
}
}