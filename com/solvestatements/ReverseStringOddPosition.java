package com.solvestatements;

public class ReverseStringOddPosition {
	public static void main(String[] args) {

		 String[]arrayOne= {"Text","Book","Plane","Zoom"};

		getStringArray(arrayOne);
	}

	public static void getStringArray(String[] words)
	{
		String[] tArray = new String[words.length];

		for (int i = 0; i < words.length; i++)
		{
			tArray[i] = "";
			for (int j = words[i].length() - 1; j >= 0; j--)
				tArray[i] += words[i].charAt(j);
		}

		System.out.println(tArray);
	}

}
