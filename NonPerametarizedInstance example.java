package practise;

public class NonPeraInstance 
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
		
	}
	public void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	public void div()
	{
		int a=10;
		int b=2;
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String aa[])
	{
	NonPeraInstance obj=new NonPeraInstance();
	obj.add();
	obj.sub();
	obj.mul();
	obj.div();
	}

}
