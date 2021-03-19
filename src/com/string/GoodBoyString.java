package com.string;

import java.util.Scanner;

public class GoodBoyString {
      
	public static String stringConvertor(String str) {
		String newStr="";
		newStr=newStr+str.charAt(0);
		char ch1=' ';
		char ch2=' ';
		char ch3=' ';
		
		for(int i=0;i<(str.length()-1);i++) {
			ch1=str.charAt(i);
			ch2=str.charAt((i+1));
			
			if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') {
				if(ch2!='a' || ch2!='e' || ch2!='i' || ch2!='o' || ch2!='u' || ch2!=' ') {
					ch3=++ch2;
					newStr=newStr+ch3;
				}
				else if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u' || ch2==' ') {
					newStr=newStr+ch2;
				}
			}
		}
		return newStr;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);		
		System.out.println("enter the string");
		String sentence = sc.nextLine();
		String str=stringConvertor(sentence);
		System.out.println(str);
	}
	
}
