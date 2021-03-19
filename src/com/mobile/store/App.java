package com.mobile.store;

import java.util.Scanner;

import com.mobile.store.*;

public class App {

	public static void main(String[] args) {
		
		Service service=new Service();
		Scanner sc=new Scanner(System.in);
		do {
			int choice;
			System.out.println("===============MENU BAR============");
			System.out.println("enter 1 for add mobile details to the system");
			System.out.println("enter 2 for display all the mobile details");
			System.out.println("enter 3 for sort all the mobile based on model and display the details");
			System.out.println("enter 4 for update mobile price for given mobile id display the details");
			System.out.println("enter 5 for delete mobile details for given mobile id");
			System.out.println("enter 6 for exit");
			System.out.println("enter the choice");
		    
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				//add mobile details
				service.takeMobileDetails();
				break;
			case 2:
				//display
				service.displayAllMobileInSystem();
				break;
			case 3:
				//sort
				
				break;
			case 4:
				//update
				service.updateAndDisplay();
				break;
			case 5:
				//delete
				service.deleteOneMobileById();
				break;
			case 6:
				//method call
				System.exit(0);
				break;
			default:
				System.out.println("invalid input");
				break;
			}	
		}while(true);
		
		

	}

}
