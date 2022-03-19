package com.pack.test;

public class Fibonacci {
	public static void main(String[] args) {
//		int sum = 0;
//		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
//		for (int number: numbers) {
//			sum += number;
//			System.out.println(+sum);
//			
//	}
		fibonacci(5);
		//System.out.println("Fibonacci series is: "+series);

	}
		public static void fibonacci(int number) {
			int num1=1,num2=1,fibSeries = 0;
			if(number==1||number==2) {
				fibSeries=1;
			}
			for(int i=3;i<=number;i++) {
				fibSeries=num1+num2;
				num1=num2;
				num2=fibSeries;
			}
			System.out.println("Fibonacci series is: "+fibSeries);
		}
		
}
