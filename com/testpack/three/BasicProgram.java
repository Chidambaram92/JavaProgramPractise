package com.testpack.three;

public class BasicProgram {
	public static void main(String[] args) {
		//fibonacci2(8);
		for(int i=1; i<=8; i++){
            System.out.println(fibonacci2(i) +" ");
        }
		boolean val=numPalindrome(121);
		System.out.println("Boolean Value is : " +val);
 
	}
	public static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
           
            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;             
            fibo1 = fibo2;
            fibo2 = fibonacci;
          
        }
        return fibonacci;
      
    }   
  public static boolean numPalindrome(int number) {
	  
	  int actualNumber= number;
	  System.out.println("Entered Number is :"+actualNumber);
	  int reverseNumber=0;
	  while (actualNumber!=0) {
		  int remainder=actualNumber%10;
		  reverseNumber=reverseNumber*10+remainder;
		  actualNumber=actualNumber/10;
	  }
	   System.out.println("Reverse number is : " +reverseNumber);
	  if(actualNumber==reverseNumber) {
		  
		 return true; 
	  }
	return false;
  }
}




