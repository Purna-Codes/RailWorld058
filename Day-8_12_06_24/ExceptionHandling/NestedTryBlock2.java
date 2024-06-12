package ExceptionHandling;

public class NestedTryBlock2 
{
	public static void main(String[] args) 
	{
		try 
		{
			try 
			{
				try 
				{
					int[] arr= {1,2,3,4,5};
					System.out.println(arr[10]);
				} 
				catch (ArithmeticException e) 
				{
					System.out.println("arithmetic exception");
					System.out.println("inner try block2 executed");
				}
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("arithmetic exception");
				System.out.println("inner try block1 executed");
			}
		} 
		catch (ArrayIndexOutOfBoundsException e1) 
		{
			System.out.println("ArrayIndexOutofBound exception");
			System.out.println("outer try block executed");
			e1.printStackTrace();
		}
		catch (Exception e2) 
		{
			System.out.println("exception handled");
			System.out.println("main try block handled");
			e2.printStackTrace();
		}
		finally 
		{
			System.out.println("all blocks execute successfully");
		}
	}
}
