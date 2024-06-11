package HashSet;

import java.util.HashSet;

public class Example1 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(100);
		hs.add(21);
		hs.add(85);
		hs.add(null);
		hs.add(11);
		hs.add(100);
		System.out.println(hs);
		System.out.println("<------Retriving elements----->");
		//Iterator<Integer> i=hs.iterator();
		/*Retriving using Iterator
		 	while(i.hasNext())
		{
			System.out.println(i.next());
		}
		Retriving using For each Loop*/
		for(Integer i1:hs)
		{
			System.out.println(i1);
		}
		/*Retriving using ListIterator========>not possible
		ListIterator<Integer>i1=hs.listIterator(hs.size());
	 	while(li.hasPrevious())
	 	{
	 		System.out.println(li.next());
	 	}*/
		//while retriving through for loop===>need to make an array with passing the hashset as a parameter
		Integer[] arr=hs.toArray(new Integer[0]);
		for(int i5=0;i5<arr.length;i5++) 
		{
			System.out.println(arr[i5]);
		}
		
	}
}
