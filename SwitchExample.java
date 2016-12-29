package practise;
import java.util.Scanner;
public class SwitchExample 
{
	public static void main(String aa[])
	{
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		switch(i)
		{
		case 1:
		{
			System.out.println("Sunday");
			break;
		}
		case 2:
		{
			System.out.println("Monday");
			break;
		}
		case 3:
		{
			System.out.println("Tuesday");
			break;
		}
		default:
		{
			System.out.println("Invalid Entry");
			break;
		}
		}
	}

}
