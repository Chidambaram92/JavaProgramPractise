package com.iopex;

import java.util.Comparator;

public class MyDetails implements Comparator<NameList>
{

	   public int compare(NameList e1, NameList e2) {
	        
		  String lOne=e1.toString();
		  System.out.println(lOne);
		  String lTwo=e2.toString();
		  System.out.println(lTwo);
		return 0;
		
	    }
}
