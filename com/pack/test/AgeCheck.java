package com.pack.test;

public class AgeCheck {


	static void checkEligibilty(int stuage, int stuweight){ 
		if(stuage<12 && stuweight<40) {
			throw new ArithmeticException("Student is not eligible for registration"); 
		}
		else {
			System.out.println("Student Entry is Valid!!"); 
		}
	} 

	static void checkOneNum(int a) throws ArithmeticException{
		float bOnne= a/0;
		System.out.println("No Arithmetic exception " +bOnne);
	}
	public static void main(String args[]){ 
//		checkEligibilty(15, 39);
		try {
			checkOneNum(80);
		} 

		catch(ArithmeticException e) {
			System.out.println("Caught Aritmetic exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally excuted"); 
		}
		
	} 
}
