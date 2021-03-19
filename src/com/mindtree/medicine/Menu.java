package com.mindtree.medicine;

import java.util.Scanner;

public class Menu {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("enter 1. Add medicine bought by a particular customer");
			System.out.println("enter  2. Display bill of the particular customer by printing customer detail and total price he need to pay ");
			System.out.println("enter 3. If the customer has senior citizen card decrease the MRP of each medicine by 5%.(Update)");
			System.out.println("enter 4. Sort customer on the basis of age.");
			System.out.println("enter 5. Delete particular medicine for a particular customer");
			System.out.println("enter 6.exit");
			int choice;
			int s=sc.nextInt();
			choice=s;
				
				switch(choice) {
				case 1:
					System.out.println("hello");
					Medicine medicine1 = new Medicine("med1",10,23);
					Customer customer1 = new Customer();
					OperationalMethods op = new OperationalMethods();
					op.buyMadicine(customer1, medicine1);
					break;
				case 2:
					System.out.println("bye");
					break;
				case 3:
					System.out.println("see you");
					break;
				case 4:
					System.out.println("exit");
					break;
				case 5:
					System.out.println("see you");
					break;
				case 6:
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
