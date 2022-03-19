package com.solvestatements;

import java.util.Scanner;

import com.pack.testtwo.FileRemoveJunkCharacters;

public class ExtractNumbersAlone 
{
	public static void main(String[] args) {
		getNumbers("abc2435");
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the String: ");
		String readWord= sc.nextLine(); 
		System.out.println("Entered string is :"
			
				+readWord);
		sc.close(); 
		FileRemoveJunkCharacters most= new
				FileRemoveJunkCharacters();

				most.enterString(readWord);

	}

	public static void getNumbers(String yesWord) {
		//String extracted=yesWord.replaceAll("[a-zA-Z]", "");
		String extracted=yesWord.replaceAll("[^0-9]", "");
		System.out.println(extracted);
		int extValue=Integer.parseInt(extracted);
		System.out.println("Number alone is :"+extValue);
	}
	public void enterString(String inputWord) {
		String junkValue="#@$()!".concat(inputWord);
		System.out.println("Junk value is: " +junkValue);
		String normalValue= junkValue.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Normal values: "+normalValue);
		if(!(normalValue.equalsIgnoreCase(inputWord))) {
			throw new RuntimeException("Junk values not removed");

		}
	}
}
