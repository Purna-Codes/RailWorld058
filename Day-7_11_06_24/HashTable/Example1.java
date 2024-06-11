package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class Example1 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ht=new Hashtable<Integer,String>();
		ht.put(101, "rahul");
		ht.put(123, "rohit");
		ht.put(155, "karan");
		ht.put(424, "ramesh");
		ht.put(522, "suresh");
		System.out.println(ht);
		System.out.println("======================");
		for(Map.Entry<Integer, String> m:ht.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
