package com.task;

public class VowelConsonant {
	
	public static String stringOp(String str) {
		String str2="";
		char ch=' ';
		char ch1=' ';
		for(int i=0;i<(str.length()-1);i++) {
			ch=str.charAt(i);
			ch1=str.charAt(i+1);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				if(ch1!='a' || ch1!='e' || ch1!='i' || ch1!='o' || ch1!='u') {
					++ch1;
					str2=str2+ch1;
				}
			}
			else {
				str2=str2+ch1;
			}
		}
		return str2;
		
	}
	
	public static void main(String[] args) {
		String str="i am good boy";
		String str1=stringOp(str);
		System.out.println(str1);
	}

}
