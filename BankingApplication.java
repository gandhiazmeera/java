import java.util.Scanner;
class BankingApplication
{
Scanner s=new Scanner(System.in);
float bal=200000.0f;
public void Setdetails()
{
System.out.println("Deposite:1");
System.out.println("Withdraw:2");
System.out.println("Balance Enquiry:3");
System.out.println("Enter your option");
int n=s.nextInt();
switch(n)
{
case 1:
{
deposite();
break;
}
case 2:
{
withdraw();
break;
}
case 3:
{
BalanceEnquiry();
break;
}
default:
{
System.out.println("Invalid Entry");
}
}
}
public void deposite()
{
System.out.println("Enter your deposite amount");
int amt=s.nextInt();
if((amt%100==0)&&(amt>100)&&(amt<=50000))
{
bal=bal+amt;
System.out.println("the available bal is:"+bal);
}
else if(amt>50000)
{
System.out.println("Enter your pan num:");
String pan = s.next();
bal=bal+amt;
System.out.println("the available bal is:"+bal);
}
else
{
System.out.println("Invalid number");
}
}
public void withdraw()
{
System.out.println("Enter your withdraw amount");
int wamt =s.nextInt();
if((wamt%100==0)&&(wamt<bal)&&(wamt<=50000))
{
bal=bal-wamt;
System.out.println("the available bal is:"+bal);
}
else
{
System.out.println("Invalid amount");
}
}
public void BalanceEnquiry()
{
System.out.println("Available bal is:"+bal);
}
public static void main(String aa[])
{
BankingApplication obj=new BankingApplication();
obj.Setdetails();
}
}