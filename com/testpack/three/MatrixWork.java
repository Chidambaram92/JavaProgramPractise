package com.testpack.three;

public class MatrixWork {
	public static void main(String[] args) {
		try {
			calcMat(3, 4);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void calcMat(int row,int col) throws InterruptedException,ArithmeticException{
		int abtMat[][]= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<i;j++) {
				
			}
		//	System.out.println("Entered Matrix is: " +abtMat[i][j]);
		}
	}
}
