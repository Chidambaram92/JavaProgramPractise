package com.solvestatements;

public class StringSearch {
	
	public static void main(String[] args) {
		int x= 5;
		x= 10;
		System.out.println(x);
		String s="strawberries";
		String sil=s.substring(0,5);
		System.out.println(sil);
		testStringFunc("Vishnu", "Ram");
	}
	public static void testStringFunc(String oneNo, String twoNo) {
		String resultVal= oneNo.concat(twoNo);
		System.out.println("Concatenated String : " +resultVal);
		char v=oneNo.charAt(5);
		System.out.println("Character at 5th index in String is : " +v);
		System.out.println("Length of concatenated string is: "+resultVal.length());
	}
}
