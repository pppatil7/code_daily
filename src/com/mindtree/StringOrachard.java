package com.mindtree;

import java.util.Scanner;

public class StringOrachard {
	static int spaceCounter=0;
	
	public static String[] wordSegregator(String str) {
		String newStr="";
		
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)==' ') {
        		spaceCounter++;
        	}
        }
		String[] strArr=new String[spaceCounter+1];
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				newStr=newStr+str.charAt(i);
			}
			else {
				strArr[count]=newStr;
				count++;
				newStr="";
			}
		}
		strArr[count]=newStr;
		return strArr;
	}
 
	public static void stringConvertor(String str) {
		String finalString="";
		String[] strArr=new String[spaceCounter+1];
		strArr=wordSegregator(str);
		char ch=' ';
		char revCh=' ';
		for(int i=0;i<strArr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<strArr[i].length();j++) {
					ch=strArr[i].charAt(j);
					revCh=++ch;
					finalString=finalString+revCh;
				}
			finalString = finalString+" ";
			}
			else {
				for(int k=(strArr[i].length()-1);k>=0;k--) {
					finalString=finalString+strArr[i].charAt(k);
				}
				if(i!=strArr.length) {
					finalString=finalString+" ";
				}
			}
		}
		System.out.println(finalString);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String userInput = sc.nextLine();
		stringConvertor(userInput);
		sc.close();
	}

}