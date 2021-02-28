package com.codedaily;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("enter a for hello");
			System.out.println("enter b for bye");
			System.out.println("enter c for see you");
			System.out.println("enter d for exit");
			char choice;
			String s=sc.next();
			choice=s.charAt(0);
				
			
				switch(choice) {
				case 'a':
					System.out.println("hello");
					break;
				case 'b':
					System.out.println("bye");
					break;
				case 'c':
					System.out.println("see you");
					break;
				case 'd':
					System.out.println("exit");
					System.exit(0);
					break;
			    default:
			    	System.out.println("error");
			    	break;
				}
		
		}
	}
}
