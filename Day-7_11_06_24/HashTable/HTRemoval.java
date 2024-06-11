package HashTable;

import java.util.Hashtable;

public class HTRemoval 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ht=new Hashtable<Integer,String>();
		ht.put(101, "rahul");
		ht.put(123, "rohit");
		ht.put(155, "karan");
		ht.put(424, "ramesh");
		ht.put(522, "suresh");
		System.out.println("Before removal: "+ht);
		ht.remove(155);
		System.out.println("======================");
		System.out.println("After removal: "+ht);
	}
}
