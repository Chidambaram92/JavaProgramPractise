package com.pack.testtwo;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CollectionsPractise {
	 public static void main (String[] args)
	   {
		//
		 testHaashMap();
		 
		// getAllHashMap();
	   }
	 public static void testHaashMap() 
	 {
		 HashMap<Integer,String> arrHash= new HashMap<Integer,String>();
		 arrHash.put(1, "Green");
		 arrHash.put(2, "Yellow");
		 arrHash.put(3, "Orange");
		 arrHash.put(4, "White");
		 System.out.println("Entered Hash MAP" +arrHash);
		 Set<Integer>arrSet= arrHash.keySet();
		 for(int arrSetsElement:arrSet) {
			 System.out.println("After fetch value of Key " +arrSetsElement+" is:" +arrHash.get(arrSetsElement) );
		 }
	 }
//	 public static void getAllHashMap() 
//	 {
//		 TreeMap<String,String> hask= new TreeMap<String,String>();
//		 hask.put("One", "Green");
//		 hask.put("Two", "Yellow");
//		 hask.put("Two", "Orange");
//		 hask.put("Two", "White");
//		 System.out.println("Entered Tree Hash is" +hask);
//		 Set<Entry<String,String>>entries= hask.entrySet();
//		 for(Entry<String,String>checker:entries){
//			 System.out.println("Values " +checker.getKey()+ "and:" +checker.getValue());
//		 }
//	 }
	
}
