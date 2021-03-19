package com.task;

import java.util.Scanner;

public class ArrayTwoD {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows in the matrix");
		int rows=sc.nextInt();
		System.out.println("enter the number of columns");
		int columns=sc.nextInt();
		int[][] arr=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("enter the element");
				int element=sc.nextInt();
				arr[i][j]=element;
			}
		}
	    int min=arr[0][0];
	    int max=arr[0][0];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
				else if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println("interchanged matrix is");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(arr[i][j]==min) {
					arr[i][j]=max;
				}
				else if(arr[i][j]==max) {
					arr[i][j]=min;
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}