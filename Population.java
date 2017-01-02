package practice;
import java.util.Scanner;
public class Population 
{
	public static void main(String aa[])
	{
		String gender;
		int mcount=0;
		int fcount=0;
		Scanner s=new Scanner(System.in);
		String str[]=new String[10];
		for(int i=0;i<10;i++)
		{
		System.out.println("Enter gender");
		 str [i]=s.nextLine();
		}
		for(int j=0;j<10;j++)
		{
		if(str [j].equals("male")){
			mcount++;
		}
		else{
			fcount++;
		}
		}
		System.out.println(mcount);
		System.out.println(fcount);
	}

}
