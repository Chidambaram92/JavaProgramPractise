package com.iopex;


import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckOne {

	public static void main(String[] args) 
	{ 
		String[]strVal= {"Hi", "Hello", "HelloWorld",  "HiTech", "HiGeek", "HiTechWorld"};
		@SuppressWarnings("rawtypes")
		List arrList= Arrays.asList(strVal);
		System.out.println(arrList);
		String REGEX = "Hi";
		String actualString=arrList.toString();
		System.out.println("Converted String:" +actualString);
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(actualString); 
		boolean matchfound = false; 
		for(int i=0; i<arrList.size();i++) {
			while (matcher.find()) { 
				System.out.println("match found" +actualString.indexOf(REGEX)); 
				matchfound = true; 
			} 
			if (!matchfound) { 
				System.out.println("No match found"); 
			}
		}
		// On;y for String 
		checkPat();
	} 
	public static void checkPat() {
		String REGEX = "(.*)(Tech)(.*)?"; 

		// create the string 
		// in which you want to search 
		String actualString 
		= "HiTech"; 

		// create a Pattern 
		Pattern pattern = Pattern.compile(REGEX); 

		// get a matcher object 
		Matcher matcher = pattern.matcher(actualString); 

		// print values if match found 
		boolean matchfound = false; 
		while (matcher.find()) { 
			System.out.println("match found"); 
			matchfound = true; 
		} 
		if (!matchfound) { 
			System.out.println("No match found"); 
		} 
	}

}
