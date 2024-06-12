package ExceptionHandling;

public class MultiCatch 
{
	public static void main(String[] args) 
	{
		try 
		{
			int arr[]=new int[5];
			arr[6]=30/0;
			System.out.println(arr[6]);
		} 
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Fnally block executed");
		}
		System.out.println("hi there!");
	}
}
