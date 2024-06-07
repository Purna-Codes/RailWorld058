package Inheritance;

public class HierarchicalInheritance extends SingleInheritance1
{
	String email="abcd@gmail.com";
	public static void main(String[] args) 
	{
		HierarchicalInheritance hi=new HierarchicalInheritance();
		System.out.println(hi.email);
		System.out.println(hi.salary);
	}
}
