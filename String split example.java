import java.util.Scanner;
public class StringExam1
{
public static void main(String aa[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your string");
String str=s.nextLine();
String arr[]=str.split(" ");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}