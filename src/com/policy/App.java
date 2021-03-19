package com.policy;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolicyService service = new PolicyService();
		Scanner sc = new Scanner(System.in);
		do {
			int choice;
			System.out.println("===============MENU BAR============");
			System.out.println(
					"enter 1 for add policy details to the system and display all policy details present in the system");
			System.out.println(
					"enter 2 for display policies whose premium fee is less than or equal to given amount fo given mode");
			System.out.println(
					"enter 3 for sort policy details by number and display all policy details presesnt in system");
			System.out.println("enter 4 for update premium fee details for given policy number");
			System.out.println("enter 5 for exit");
			System.out.println("enter the choice");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				// add policy details to the system and display all policy details present in
				// the system
				service.takePolicyDetails();
				service.displayAllPolicyDetails();
				break;
			case 2:
				// display policies whose premium fee is less than or equal to given amount fo
				// given mode
				service.searchByPremiumFeeAndPremiumMode();
				break;
			case 3:
				// sort policy details by number and display all policy details presesnt in
				// system
				service.sortByPolicyNumber();
				break;
			case 4:
				// update premium fee details for given policy number
				service.updatePremiumFeeByPolicyNumber();
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
