package DemoProject;

public class NamePrinting 
{
	public static void main(String[] args) 
	{
		String name="PURNA";
		for(int i=1;i<=name.length();i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || j==1 || i==5 || j==5)
				{
					System.out.print("* ");
				}
				else
					{
					System.out.print("  ");
					}
		
			}
			System.out.println();
			
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1)
				{
					System.out.print("* ");
				}
				/*else
					{
					System.out.print("  ");
					}*/
		
			}
			System.out.println();
			
		}
		
	}
}
