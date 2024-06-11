package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class GetOrDefault 
{
	public static void main(String args[])
	{  
	    Hashtable<Integer,String> ht=new Hashtable<Integer,String>();          
	     ht.put(100,"Amit");    
	     ht.put(102,"Ravi");   
	     ht.put(101,"Vijay");    
	     ht.put(103,"Rahul");  
	     System.out.println(ht);
	     System.out.println("======");
	     System.out.println(ht.getOrDefault(101, "Not Found"));  
	     System.out.println(ht.getOrDefault(105, "Not Found"));  
	     System.out.println("Retriving elements from an HashTable======>>>>>>>");
	     for(Map.Entry<Integer,String> m:ht.entrySet())
	     {
	    	 System.out.println(m.getKey()+"-->"+m.getValue());
	     }
	}
}
