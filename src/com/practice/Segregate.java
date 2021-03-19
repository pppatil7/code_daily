package com.practice;

import java.util.Scanner;

public class Segregate {
     static int arrCounter=0;
     static int[] charArr;
	public static boolean arrayChecker(char ch,int length) {
		boolean flag=true;
		int ascii=ch;
		charArr=new int[length];
		charArr[arrCounter]=ascii;
		
		for(int i=0;i<arrCounter;i++) {
			if(charArr[i]==ascii) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public void numCharSegregator(String str1, String str2) {
		String numString="";
		String charString="";
		int length=str1.length()+str2.length();
		char ch1=' ';
		char ch2=' ';
		int ascii=0;
		for(int i=0;i<str1.length();i++) {
			ch1=str1.charAt(i);
			ascii=ch1;
			if(ascii>=48 && ascii<=57 && arrayChecker(ch1,length)==true) {
				numString=numString+ch1;
			}
			else {
				charString=charString+ch1;
			}
		}
		
		for(int j=0;j<str2.length();j++) {
			ch2=str2.charAt(j);
			ascii=ch2;
			if(ascii>=48 && ascii<=57 && arrayChecker(ch2,length)==true) {
				numString=numString+ch2;
			}
			else {
				charString=charString+ch2;
			}
		}
		System.out.println(numString);
		System.out.println(charString);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Segregate sg=new Segregate();
		System.out.println("enter the first string");
		String firstString=sc.nextLine();
		System.out.println("enter the second string");
		String secondString=sc.nextLine();
		sg.numCharSegregator(firstString, secondString);
	}

}
