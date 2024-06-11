package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Example1 
{
	public static void main(String[] args) 
	{  
			   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
			    System.out.println("empty element: "+hm);  
			      hm.put(100,"Amit");    
			      hm.put(101,"Vijay");    
			      hm.put(102,"Rahul");   
			       
			      System.out.println("Post put()");  
			      for(Map.Entry<Integer,String> m:hm.entrySet())
			      {    
			       System.out.println(m.getKey()+"<====>"+m.getValue());    
			      }  
			       System.out.println("==============="); 
			      hm.putIfAbsent(103, "Gaurav");  
			      System.out.println("Post putIfAbsent()");  
			      for(Map.Entry<Integer,String> m:hm.entrySet())
			      {    
			           System.out.println(m.getKey()+"<====>"+m.getValue());    
			      }  
			      System.out.println("=============");
			      HashMap<Integer,String> map=new HashMap<Integer,String>();  
			      map.put(104,"Ravi");  
			      map.putAll(hm);  
			      System.out.println("Post putAll() ");  
			      for(Map.Entry<Integer,String> m:map.entrySet())
			      {    
			           System.out.println(m.getKey()+"<====>"+m.getValue());    
			      }  
		}  
}
