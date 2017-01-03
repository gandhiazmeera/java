package practice;
import java.util.Scanner;
public class ArmstrongExample {	
	public static void main(String aa[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =s.nextInt();		
		int temp = n;
		int sum = 0;
		int mod = 0;
		
		while(temp != 0) {
			
			mod = temp % 10;
			sum = sum + (mod * mod * mod);
			temp = temp / 10;
		}
		
		if(sum == n) 
			System.out.println(n + " is an Armstrong number");
		else
			System.out.println(n + " is not an Armstrong number");
}
}