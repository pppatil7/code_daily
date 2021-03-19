package com.movie;

import java.util.Scanner;

public class Service {
	
	public static Movie[] movieArr=new Movie[100];
	public static String[] castingArr;
	public static int arraySize=0;
	static Scanner sc=new Scanner(System.in);
	
	
	public void addMovieToArray(Movie movie) {
		movieArr[arraySize]=movie;
		arraySize++;
	}
	
	public void takeMovieDetails() {
		System.out.println("enter the id of the movie");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name of the movie");
		String movieName=sc.nextLine();
		System.out.println("enter the casting details");
		castingArr=takeCastingDetails();
		System.out.println("enter the year of release");
		int yearOfRelease=sc.nextInt();
		System.out.println("enter the rating of the movie");
		int rating=sc.nextInt();
		Movie movie=new Movie(id, movieName, castingArr, yearOfRelease, rating);
		addMovieToArray(movie);
	}
	
	public String[] takeCastingDetails() {
		System.out.println("enter the number of casting the movie");
		int numberOfCasting=sc.nextInt();
		castingArr=new String[numberOfCasting];
		sc.nextLine();
		for(int i=0;i<numberOfCasting;i++) {
			System.out.println("enter the name of the casting in the movie");
			String castName=sc.nextLine();
			castingArr[i]=castName;
		}
		return castingArr;
	}
	
	public static String printCastingById(int id) {
		String str="";
		int counter=1;
		String strCount="";
		for(int i=0;i<arraySize;i++) {
			if(movieArr[i].getId()==id) {
				for(int j=0;j<castingArr.length;j++) {
					strCount=""+counter+".";
					str=str+strCount+"" +castingArr[j] +" ";
					counter++;
				}
			}
		}
		return str;
	}
	
	public void displayAllMovieDetails(){
		
		for(int i=0;i<arraySize;i++) {
			System.out.println(movieArr[i].getId()+" "+movieArr[i].getMovieName()+" "+printCastingById(movieArr[i].getId())+""+movieArr[i].getYearOfRelease()+" "+movieArr[i].getRating());
		}
		
	}
	
	public void displayAllGreaterThanOrEqualRating() {
		System.out.println("enter the rating that u wanted to show movie greater than that");
		int rating=sc.nextInt();
		
		for(int i=0;i<arraySize;i++) {
			if(movieArr[i].getRating()>=rating) {
				System.out.println(movieArr[i].getId()+" "+movieArr[i].getMovieName()+" "+printCastingById(movieArr[i].getId())+" "+movieArr[i].getYearOfRelease()+" "+movieArr[i].getRating());
			}
		}
	}
	
	public void updateRatingById(){
		System.out.println("enter the id of the movie that u wanted to update the rating");
		int id=sc.nextInt();
		System.out.println("enter the updated rating of that movie");
		int rating=sc.nextInt();
		
		for(int i=0;i<arraySize;i++) {
			if(movieArr[i].getId()==id) {
				movieArr[i].setRating(rating);
				break;
			}
		}
	}
	
	public void deleteById() {
		System.out.println("enter the id of the movie that u wanted to delete");
		int id=sc.nextInt();
		int index=0;
		for(int i=0;i<arraySize;i++) {
			if(movieArr[i].getId()==id) {
				index=i;
				break;
			}
		}
		for(int j=index;j<(arraySize-1);j++) {
			movieArr[j]=movieArr[j+1];
		}
		arraySize--;
	}

}
