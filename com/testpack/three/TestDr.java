package com.testpack.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestDr {
	public static void main(String[] args) {
		int counter = 0;
		TestDr obj = new TestDr();
		System.out.println("String Array main method");
		obj.testOne(counter);
		main("test");
	}

	public static void main(String args) {
		System.out.println("String override main method :" + args);
		testNames();
	}

	public void testOne(int increement) {
		for (int i = 0; i < 5; i++) {
			System.out.println(increement);
		}
		increement++;
	}

	public static void testNames() {
		HashMap<String, String> haloCars = new HashMap<String, String>();

		haloCars.put("ford", "GT");
		haloCars.put("dodge", "Viper");
		haloCars.put("ford", "Mustang Mach-E");
		System.out.println(haloCars.get("dodge"));
		System.out.println(haloCars.get("ford"));

		// Map
		  Map<String, ArrayList<String>> multiValueMap = new HashMap<String,
		  ArrayList<String>>();
		  
		  multiValueMap.put("ford", new ArrayList<String>());
		  multiValueMap.get("ford").add("GT");
		  multiValueMap.get("ford").add("Mustang Mach-E");
		  multiValueMap.get("ford").add("Pantera");
		 
	}
}
