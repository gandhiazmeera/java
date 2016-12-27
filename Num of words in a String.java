import java.util.Scanner;
public class NumWordString
{
public static void main(String aa[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your string");
String str=s.nextLine();
String arr[]=str.split(" ");
System.out.println(arr.length);
}
}