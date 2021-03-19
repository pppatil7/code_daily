package com.practice;

import java.util.Scanner;

public class Digonal {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] matrix=new int[3][3];
		System.out.println("enter the elements in the 3*3 matrix");
		int element=0;
		int primaryAddition=0;
		int primaryCounter=0;
		int secondaryAddition=0;
		int secondaryCounter=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("enter the element");
				element=sc.nextInt();
				matrix[i][j]=element;
				if(i==j) {
					if(element%2!=0) {
						primaryAddition=primaryAddition+element;
						primaryCounter++;
					}
				}
				if(i+j==2) {
					if(element%2!=0) {
						secondaryAddition=secondaryAddition+element;
						secondaryCounter++;
					}
				}
			}
		}
		System.out.println("primary diagonal odd number average");
		System.out.println(primaryAddition/primaryCounter);
		System.out.println("secondary diagonal odd number average");
		System.out.println(secondaryAddition/secondaryCounter);
	}
}
