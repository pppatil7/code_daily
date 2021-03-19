package com.mindtree.mobile;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		InputArray input=new InputArray();
		Scanner sc=new Scanner(System.in);
		while(true) {
			int choice;
			System.out.println("enter 1 for add mobile details and display all mobile details present in system");
			System.out.println("enter 2 for Display all mobile details sorted by Model name and display all details present in system");
			System.out.println("enter 3 for Display all mobile details whose price is less than or equal to given price and with camera included");
			System.out.println("enter 4 for Update price for given Mobile id and display updated details");
			System.out.println("enter 5 for Delete the mobile details based on Mobile Id");
			System.out.println("enter 6 for exit");
		    
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				//method call
				input.takeArrayValue();
				break;
			case 2:
				//method call
				break;
			case 3:
				//method call
				break;
			case 4:
				//method call
				break;
			case 5:
				//method call
				break;
			case 6:
				//method call
				System.exit(0);
				break;
			default:
				System.out.println("invalid input");
				break;
			}	
		}
	}
}