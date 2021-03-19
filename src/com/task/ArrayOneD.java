package com.task;

import java.util.Scanner;

public class ArrayOneD {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int arraySize=sc.nextInt();
		int[] arr1=new int[arraySize];
		for(int i=0;i<arraySize;i++) {
			System.out.println("enter the first array element");
			int element1=sc.nextInt();
			arr1[i]=element1;
		}
		int[] arr2=new int[arraySize];
		for(int j=0;j<arraySize;j++) {
			System.out.println("enter the second array element");
			int element2=sc.nextInt();
			arr2[j]=element2;
		}
		
		int[] resArr=new int[arraySize];
		System.out.println("the resultant array is");
		for(int k=0;k<arraySize;k++) {
			resArr[k]=arr1[k]-arr2[k];
			System.out.print(resArr[k]+" ");
		}
		System.out.println();
	System.out.println("negative array");
		for(int z=0;z<arraySize;z++) {
			if(resArr[z]<0) {
				System.out.print(resArr[z]+" ");
			}
		}
			
	}
	
}
