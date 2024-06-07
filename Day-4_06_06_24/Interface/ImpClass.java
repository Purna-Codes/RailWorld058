package Interface;

import Abstraction.main;

public class ImpClass implements Printable
{
	public void print()
	{
		System.out.println("hey!Print now");
	}
	public static void main(String[] args) 
	{
		ImpClass imp = new ImpClass();
		imp.print();
	}
}
