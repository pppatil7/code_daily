package com.movie;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		Service service=new Service();
		Scanner sc=new Scanner(System.in);
		do {
			int choice;
			System.out.println("===============MENU BAR============");
			System.out.println("enter 1 for add movie details to the system");
			System.out.println("enter 2 for display all the mobile details");
			System.out.println("enter 3 for sort all the mobile based on model and display the details");
			System.out.println("enter 4 for update mobile price for given mobile id display the details");
			System.out.println("enter 5 for delete mobile details for given mobile id");
			System.out.println("enter 6 for exit");
			System.out.println("enter the choice");
		    
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				//
				service.takeMovieDetails();
				break;
			case 2:
				//display
				service.displayAllMovieDetails();
				break;
			case 3:
				//sort
				
				break;
			case 4:
				//display greater then or equal to given rating 
				service.displayAllGreaterThanOrEqualRating();
				break;
			case 5:
				//display for given casting
				
				break;
			case 6:
				//update
				service.updateRatingById();
				break;
			case 7:
				//delete
				service.deleteById();
				break;
			case 8:
				//exit
				System.exit(0);
				break;
			default:
				System.out.println("invalid input");
				break;
			}	
		}while(true);
		

	}

}
