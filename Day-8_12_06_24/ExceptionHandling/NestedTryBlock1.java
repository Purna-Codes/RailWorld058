package ExceptionHandling;

public class NestedTryBlock1 
{
	public static void main(String[] args) 
	{
		try
		{
			try 
			{
				System.out.println("===generating arithmetic Exception===");
				int y=30/0;
			} 
			catch (ArithmeticException e) 
			{
				System.out.println(e);
			}
			try
			{
				System.out.println("===generating AIOB Exception===");
				int arr[]=new int [5];
				System.out.println(arr[6]);
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{
				e.printStackTrace();
			}
			System.out.println("All inner try blocks executed");
		}
		catch(Exception e)
		{
			System.out.println("outer catch block executed");
		}
		finally 
		{
			System.out.println("finally block executed");
		}
	}	
}
