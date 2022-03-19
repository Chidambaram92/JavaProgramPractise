package com.pack.test;

public class LargestNumber {

//	public static void main(String[] args) {
//
//	      int[] age = new int[5];
//
//	      for (int i = 0; i <5; ++i) {
//	    	  age[i]+=i;
//	    	  
//	         System.out.println(age[i]);
//	      }
//	   }
	public static void main(String[] args) {

	      int num1 = 15, num2 = 20, num3 = 20;

	      if( num1 >num2 && num1 >num3) {
	          System.out.println(num1+ " Number 1 is the largest Number");
	      }
	      else if (num2 >num1 && num2 >num3) {
	          System.out.println(num2+ " Number 2 is the largest Number");
	      }
	      else if(num3==num1 || num3==num2) {
	          if(num3==num1) {
	        	  System.out.println(num1 +" and " +num3 +" Number 1 and Number 3 are  equal and the largest Number");
	          }
	          if(num2==num3) {
	        	  System.out.println(num2 +" and " +num3 +" Number 2 and Number 3 are  equal and the largest Number");
	          }
	      }
	      else {
	    	  System.out.println(num3+ " Number 3 is the largest Number");
	      }
	  }
	}
