package com.practice;

import java.util.Scanner;

public class OccurenceString {
      
	public int subStringCounter(String str,String subStr) {
		int subStrLength=subStr.length();
		int subStrCounter=0;
		int matchCounter=0;
		char strCh=' ';
		char subStrCh=' ';
		for(int i=0;i<str.length();i++) {
			//System.out.println("inside for loop");
			strCh=str.charAt(i);
			subStrCh=subStr.charAt(subStrCounter);
			if(strCh==subStrCh) {
				//System.out.println("character matched");
				subStrCounter++;
				if((subStrCounter+1)==subStrLength) {
					matchCounter++;
					//System.out.println("matchCounter incremented");
					subStrCounter=0;
				}
			}
			else {
				subStrCounter=0;
			}
		}
		return matchCounter;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OccurenceString oc=new OccurenceString();
		System.out.println("enter the sentence");
		String sentence=sc.nextLine();
        System.out.println("enter the substring that u wanted to search");
        String subString=sc.nextLine();
        int counter=0;
        counter=oc.subStringCounter(sentence, subString);
        System.out.println("your entered string counter is");
        System.out.println(counter);
	}

}
