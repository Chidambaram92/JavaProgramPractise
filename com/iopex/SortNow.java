package com.iopex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortNow {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// Create an ArrayList and populate it with elements
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("@#chennai");
		arrayList.add("andhara");
		arrayList.add("@#$&mumbai");
		System.out.println("Elements in ArrayList prior sorting :");
		for(int i=0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));
		@SuppressWarnings("rawtypes")
		Comparator comparator = Collections.reverseOrder();
		Collections.sort(arrayList,comparator);
		System.out.println("Elements in ArrayList after sorting :");
		for(int i=0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));

	}
}


