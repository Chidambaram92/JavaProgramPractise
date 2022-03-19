package com.iopex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
	  public static void main(String a[]){
	         
	        List<NameList> list = new ArrayList<NameList>();
	        list.add(new NameList("#chennai"));
	        list.add(new NameList("andhara"));
	        list.add(new NameList("@#$&mumbai"));
	        Collections.sort(list,new MyDetails());
	        System.out.println("Sorted list entries: ");
	        for (int i=0; i<list.size(); i++) {
	            System.out.println(list.get(i)); 
	    } 
	    }
}
