package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExammple2 
{
	public static void main(String[] args) 
		{
			List<Book> li=new LinkedList<Book>();
			Book b1=new Book(12, "math", "hello", "hi", 10000);
			Book b2=new Book(15, "geography", "helo", "hhi", 15000);
			Book b3=new Book(18,"science", "fwskfho", "fs", 10500);
			Book b4=new Book(20,"dhdh", "ssscfcfs", "shi", 1500);
			li.add(b4);
			li.add(b3);
			li.add(b2);
			li.add(b1);
			for(Book b:li)
			{
				System.out.println(b.id+" "+b.author+" "+b.name+" "+b.price+" "+b.publisher);
			}
		}
	}

