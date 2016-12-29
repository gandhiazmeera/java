package practise;
import java.util.Scanner;
public class ScannerMultiplication 
{
	public static void main(String aa[])
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=1;i<=10;i++)
	{
		int r=n*i;
		System.out.println(n+"*"+i+"="+r);
	}
	}
}
