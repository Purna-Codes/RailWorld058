package StringHandling;

public class ConcatTest 
{
	public static void main(String[] args) 
	{
		long startTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("java");
		for(int i=0;i<1000;i++)
		{
			sb.append(" is awesome.Hence I love it!");	
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Buffer Build Time = "+(endTime-startTime)+"ms");
		long startTime1=System.currentTimeMillis();
		StringBuilder sb1=new StringBuilder("java");
		for(int i=0;i<1000;i++)
		{
			sb1.append(" is awesome.Hence I love it!");	
		}
		long endTime1=System.currentTimeMillis();
		System.out.println("Builder Build Time = "+(endTime1-startTime1)+"ms");
	}
}
