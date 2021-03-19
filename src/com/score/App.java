package com.score;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		PlayerService service=new PlayerService();
		Scanner sc = new Scanner(System.in);
		do {
			int choice;
			System.out.println("===============MENU BAR============");
			System.out.println(
					"enter 1 for add player details to array");
			System.out.println(
					"enter 2 for update player score details based on id");
			System.out.println(
					"enter 3 for insertion sort");
			System.out.println("enter 4 for display particular player details based on id using binary search");
			System.out.println("enter 5 for exit");
			System.out.println("enter the choice");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				service.takePlayerDetails();
				break;
			case 2:
				  
				  service.updateScoreDetailsById();
				break;
			case 3:
				//insertion sort
				break;
			case 4:
				service.searchPlayerDetailsById();
				break;
			case 5:
				// exit
				System.exit(0);
				break;
			default:
				System.out.println("invalid input");
				break;
			}
		} while (true);
		
		
		
	}
	

}
