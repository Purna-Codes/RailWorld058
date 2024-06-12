package ExceptionHandling;

public class Example1 
{
	public static void main(String[] args) 
	{
		try
		{
			int x=100/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block executed");
		}
		System.out.println("all blocks executed");
	}
}
