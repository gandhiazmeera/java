package userdefined;
import java.util.*;
public class EvenOrOdd {
public static void main(String aa[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int n=s.nextInt();
if(n%2==0){
	System.out.println("Given number is even:"+n);
}
else{
	System.out.println("Given number is odd:"+n);
}
}
}
