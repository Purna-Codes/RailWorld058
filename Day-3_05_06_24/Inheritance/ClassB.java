package Inheritance;

public class ClassB 
{

	public static void main(String[] args) 
	{
		String s="java";
		String d="java";
		System.out.println("s value is "+s);
		System.out.println("s address is "+s.hashCode());
		System.out.println("d value is "+d);
		System.out.println("d address is "+d.hashCode());
		
		System.out.println("============================");
		
		s="hello";
		System.out.println("s address is "+s.hashCode());
		d="world";
		System.out.println("d address is "+d.hashCode());
		
		System.out.println("============================");
		
		System.out.println("s value is "+s);
		System.out.println("d value is "+d);
		
		System.out.println(s.hashCode()==d.hashCode());
		
		System.out.println(s==d);
		System.out.println("============================");
		String s1=new String("java").intern();
		//System.out.println(s.equals(d));
		System.out.println(s==s1);
		
	}
}
