package ArrayList;

import java.util.ArrayList;

public class ArrayListExample2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("apple");
		al.add("mango");
		al.add("banana");
		al.add("orange");
		System.out.println(al);	
		System.out.println("3rd element is "+al.get(2));
		System.out.println("==============");
		al.set(2, "jackfruit");
		System.out.println(al);
		System.out.println("==============");
		//retriving elements from ArrayList using Foreach loop
		for(String s:al)
		{
			System.out.println(s);
		}
	}
}
