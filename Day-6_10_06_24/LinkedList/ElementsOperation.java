package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ElementsOperation 
{
	public static void main(String[] args) 
	{
		LinkedList<String>ll=new LinkedList<>();
		ll.add("apple");
		ll.add("mango");
		ll.add("banana");
		ll.add("orange");
        ll.add("virat");  
        ll.add("gaurav");  
        ll.add("harsh");  
        ll.add("amit");
		System.out.println(ll);
		ll.remove("Amit");
		System.out.println("=================");
		System.out.println(ll);
		ll.remove(4);
		System.out.println("=================");
		System.out.println(ll);
		System.out.println("=================");
		ll.add(0, "java");
		System.out.println(ll);
		System.out.println("=================");
		//sorting using Lambda Expression
		Collections.sort(ll, (s1,s2)->s2.compareTo(s1));
		System.out.println(ll);
		System.out.println("=================");
		Iterator<String> i=ll.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
