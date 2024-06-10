package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting 
{
	public static void main(String[] args) 
	{
		ArrayListSorting als= new ArrayListSorting();
		als.meth1();
		als.meth2();
	}
	void meth1()
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("apple");
		al.add("mango");
		al.add("banana");
		al.add("orange");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("post sorting = "+al);
		System.out.println("retriving element from an ArrayList----->");
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("=================");
	}
	
	void meth2()
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(8);
		al1.add(15);
		al1.add(11);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println("post sorting = "+al1);
		System.out.println("retriving element from an ArrayList----->");
		for(int s:al1)
		{
			System.out.println(s);
		}
	}
}
