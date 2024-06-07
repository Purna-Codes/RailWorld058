package StringHandling;

public class BufferTest 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("java ");
		sb.append("is awesome");
		System.out.println(sb);
		System.out.println(sb.length());
	}
}
