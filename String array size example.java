import java.util.Scanner;
public class StringExam
{
public static void main(String aa[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your arry size");
int size=s.nextInt();
String arr[]=new String[size];
int i=0;
for(i=0;i<arr.length;i++)
{
arr[i]=s.next();
}
for(i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}