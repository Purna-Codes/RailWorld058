package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortDescending {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(8);
		al1.add(15);
		al1.add(11);
		al1.add(1);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println("post ascending sorting = "+al1);
		Collections.reverse(al1);
		System.out.println("post descending sorting = "+al1);
		System.out.println("retriving element from an ArrayList----->");
		for(int s:al1)
		{
			System.out.println(s);
		}
	}

}
