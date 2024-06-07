package OOPS_Basics;

public class Swapping 
{
	public static void main(String[] args) 
	{
		Swapping s=new Swapping();
		System.out.println(s.meth1(10, 20));
		/*with using 3rd variable
		int a=10;
		int b=20;
		int c;
		c=a;
		a=b;
		b=c;*/
		/*without using 3rd variable
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("b value is "+b);
		System.out.println("a value is "+a);*/
	}
	String meth1(int a, int b)
	{
		int c = a;
		a=b;
		b=c;
		return a+" "+b;
	}
}
