package ExceptionHandling;

public class ThrowVsThrows1 
{
	public static void meth1() throws ArithmeticException
	{
		System.out.println("inside main method");
		throw new ArithmeticException("show arithmetic exception");
	}
	public static void main(String[] args)
	{
		try 
		{
			meth1();
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("error handled in main method");
		}
	}
}
