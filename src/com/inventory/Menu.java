package com.inventory;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		Service service=new Service();
		Scanner sc=new Scanner(System.in);
		do {
			int choice;
			System.out.println("===============MENU BAR============");
			System.out.println("enter 1 for add new product in inventory");
			System.out.println("enter 2 for update the quantity for particular product");
			System.out.println("enter 3 for display productswhere quantity is less than provided by a user");
			System.out.println("enter 4 for display product sort on the basis of quantity");
			System.out.println("enter 5 for delete a particular product from inventory");
			System.out.println("enter 6 for exit");
			System.out.println("enter the choice");
		    
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				//method call
				service.takeInputAndAddProduct();
				
				break;
			case 2:
				//update the quantity of particular product
				service.updateQuantityofProduct();
				break;
			case 3:
				//display products where quantity is less than provided by a user
				service.displayProductsWhereQuantityLess();
				break;
			case 4:
				//method call
				service.productSortByQuantity();
				break;
			case 5:
				//display the all product
				service.displayProductDetails();
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
