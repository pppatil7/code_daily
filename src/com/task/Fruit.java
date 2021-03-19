package com.task;

import java.util.Scanner;

public class Fruit {
	static Scanner sc=new Scanner(System.in);
	static String[] fruitArr=new String[100];
	static int arraySize=0;
	public static void takeStringArray() {
		System.out.println("enter the number of fruits that u wanted to enter");
		int numberOfFruits=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<numberOfFruits;i++) {
			System.out.println("enter the name of fruit");
			String fruitName=sc.nextLine();
			fruitArr[i]=fruitName;
			arraySize++;
		}
	}
	public static boolean stringIsLowerCase(String str) {
		boolean flag = false;
		for(int i=0;i<str.length();i++) {
			int ascii=str.charAt(i);
			if(ascii>96 && ascii<123) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	public static boolean searchArray(String str) {
		boolean flag=false;
			for(int i=0;i<arraySize;i++) {
				if(fruitArr[i].contains(str)) {
					flag=true;
				}
			}
			return flag;
	}
	
	
	
	public static void main(String[] args) {
		
		takeStringArray();
		System.out.println("enter the fruit that u wanted to search");
		//sc.nextLine();
		String searchFruit=sc.nextLine();
		boolean isLower=stringIsLowerCase(searchFruit);
		if(isLower==true) {
			boolean flag=searchArray(searchFruit);
			if(flag==true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
		
		
	}
}
