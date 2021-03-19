package com.task;

import java.util.Scanner;

public class ArrayOneDSort {
	static Scanner sc=new Scanner(System.in);
	
	//insertion sort
	public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
   
   public static int[] takeArray() {
		System.out.println("enter the size of the array");
		int arraySize=sc.nextInt();
	    int[] arr=new int[arraySize];
	    for(int i=0;i<arraySize;i++) {
	    	System.out.println("enter the array element");
	    	int element=sc.nextInt();
	    	arr[i]=element;
	    }
	    return arr;
	}
	
   
   public static void primePrinter(int[] arr) {
	   int size=arr.length;
	   
	   for(int z=0;z<size;z++) {
		   int i,m=0,flag=0;      
		   int n=arr[z];//it is the number to be checked    
		   m=n/2;      
		   if(n==0||n==1){  
		    //System.out.println(n+" is not prime number");      
		   }else{  
		    for(i=2;i<=m;i++){      
		     if(n%i==0){      
		      //System.out.println(n+" is not prime number");      
		      flag=1;      
		      break;      
		     }      
		    }      
		    if(flag==0)  { System.out.print(n+" "); }  
		   }//end of else  
	   }
   }
   
   
   
	public static void main(String[] args) {
		
		int[] arr=takeArray();
		int size=arr.length;
		sort(arr);
		System.out.println("sorted array");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("prime number sorted array");
       	primePrinter(arr);
	}
}