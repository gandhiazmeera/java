import java.util.Scanner;
public class StringExam2
{
public static void main(String aa[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your string");
String str=s.nextLine();
String arr[]=str.split(" ");
for(int i=arr.length-1;i>=0;i--)
{
System.out.println(arr[i]+" ");
}
}
}