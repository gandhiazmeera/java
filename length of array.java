import java.util.Scanner;

public class Array 
{
public static void main(String arge[])
{
Scanner in = new Scanner(System.in);

int n[]= new int[5];

for(int i=0;i<n.length;i++)
	
{
	 n[i] =in.nextInt();
}
for(int c:n)
{
	System.out.println(c);
}

System.out.println( "lenght of the array \t : "  +n.length);
}

}
