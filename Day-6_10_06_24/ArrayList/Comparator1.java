package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 
{
	public static void main(String[] args) 
	{
		List<ArrayListSortUsingComparator> phoneList = new ArrayList<>(); 
		ArrayListSortUsingComparator ph1=new ArrayListSortUsingComparator("apple", "11s", 100000, 4);
		ArrayListSortUsingComparator ph2=new ArrayListSortUsingComparator("samsung", "i5", 50000, 4);
		ArrayListSortUsingComparator ph3=new ArrayListSortUsingComparator("mi", "11s", 125000, 4);
		ArrayListSortUsingComparator ph4=new ArrayListSortUsingComparator("motorola", "15s", 41100, 4);
		phoneList.add(ph1);
		phoneList.add(ph2);
		phoneList.add(ph3);
		phoneList.add(ph4);
		System.out.println("Actual List"+phoneList);   
	    System.out.println("Sorting the list as comparator");  
	    Collections.sort(phoneList, new RatingComparator());  
	    System.out.println(phoneList);  
	    System.out.println("Reversing the Comparator sorting");  
	    Comparator<ArrayListSortUsingComparator> cmp = Collections.reverseOrder(new RatingComparator());  
	    Collections.sort(phoneList, cmp);  
	    System.out.println("Printing the reverse list");  
	    System.out.println(phoneList);  
	    }  
	}
