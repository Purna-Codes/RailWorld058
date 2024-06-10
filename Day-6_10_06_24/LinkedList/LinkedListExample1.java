package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample1 {

	public static void main(String[] args) 
	{
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("apple");
		ll.add("orange");
		ll.add("banana");
		ll.add("pineapple");
		System.out.println(ll);
		System.out.println("retriving elements from an LinkedList");
		System.out.println("===============");
		Iterator<String>i=ll.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("========================");
		ListIterator<String>i1=ll.listIterator(ll.size());
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}

	}

}
