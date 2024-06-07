package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Generics 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();  
		Scanner sc=new Scanner(System.in);
		System.out.println("entering elements to an ArrayList");
		for(int i=0;i<5;i++)
		{
			al.add(sc.nextInt());
		}
		//al.add("String");
		System.out.println(al);  
		System.out.println("Retriving elements from an ArrayList");
		Iterator<Integer> itr=al.iterator();  
		while(itr.hasNext())
		{  
			System.out.print(itr.next()+" ");  
		}  
	}  
		 
}
