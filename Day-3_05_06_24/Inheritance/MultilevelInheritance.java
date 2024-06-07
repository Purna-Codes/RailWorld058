package Inheritance;

public class MultilevelInheritance extends SingleInheritance2 
{
	
	public static void main(String[] args) 
	{
		MultilevelInheritance ml=new MultilevelInheritance();
		System.out.println("salary is "+ml.salary);
		ml.meth1();
	}
	void meth1()
	{
		System.out.println(super.salary);
	}
}
