package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class BookHT 
{
	public static void main(String[] args) 
	{
		Map<Integer,Book> mp=new Hashtable<Integer,Book>();
		Book b1=new Book(12, "math", "hello", "hi", 10000);
		Book b2=new Book(15, "geography", "helo", "hhi", 15000);
		Book b3=new Book(18,"science", "fwskfho", "fs", 10500);
		Book b4=new Book(20,"dhdh", "ssscfcfs", "shi", 1500);
		mp.put(1, b1);
		mp.put(2, b2);
		mp.put(3, b3);
		mp.put(4, b4);
		System.out.println("Retriving data from Book");
		for(Map.Entry<Integer, Book> m1:mp.entrySet())
		{
			int key=m1.getKey();
			Book value=m1.getValue();
			System.out.println(key+"=====details=======");
			System.out.println(value.id+" "+value.name+" "+value.publisher+" "+value.author+" "+value.price);
		}
	}
}
