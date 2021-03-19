package com.score;

import java.util.Scanner;

public class PlayerService {

	private final static int DEFAULT_SIZE = 2;
	static PlayerDetails[] playerDetailsArr = new PlayerDetails[DEFAULT_SIZE];
	static int currentArraySize = 0;
	Scanner sc = new Scanner(System.in);

	public PlayerDetails[] takePlayerDetails() {
		System.out.println("enter the player id");
		int playerId = sc.nextInt();
		System.out.println("enter the player name");
		sc.nextLine();
		String playerName = sc.nextLine();
		System.out.println("enter the age of the player");
		int playerAge = sc.nextInt();
		System.out.println("enter the country of the player");
		sc.nextLine();
		String playerCountry = sc.nextLine();
		System.out.println("enter the score of the player");
		int playerScore = sc.nextInt();
		boolean flag = isCountryNamevalid(playerCountry);
		if (flag == true) {
			PlayerDetails playerDetails = new PlayerDetails(playerId, playerName, playerAge, playerCountry,
					playerScore);
			addPlayerDetailsToArray(playerDetails);
		} else {
			System.out.println("enter the country name correct");
			takePlayerDetails();
		}
		return playerDetailsArr;
	}

	public void addPlayerDetailsToArray(PlayerDetails playerDetails) {
		if (currentArraySize < playerDetailsArr.length) {
			playerDetailsArr[currentArraySize] = playerDetails;
			currentArraySize++;
		} else if (currentArraySize == playerDetailsArr.length) {
			growArray();
			playerDetailsArr[currentArraySize] = playerDetails;
			currentArraySize++;
		}
	}

	public void growArray() {
		int newSize = playerDetailsArr.length * 2;

		PlayerDetails[] tempArray = new PlayerDetails[newSize];
		for (int i = 0; i < currentArraySize; i++) {
			tempArray[i] = playerDetailsArr[i];
		}
		playerDetailsArr = tempArray;
	}

	public boolean isCountryNamevalid(String playerCountry) {
		boolean flag = false;
		String newStr = "";
		int ascii = 0;
		char ch = ' ';
		for (int i = 0; i < playerCountry.length(); i++) {
			ch = playerCountry.charAt(i);
			ascii = ch;

			if (ascii >= 65 && ascii <= 90) {
				ascii = ascii + 32;
				ch = (char) ascii;
			}
			newStr = newStr + ch;
		}
		if (newStr.equals("india") || newStr.equals("england")) {
			flag = true;
		}
		return flag;
	}

	// update the score of player by Id
	public PlayerDetails[] updateScoreDetailsById() {

		System.out.println("enter player Id that u wanted to update");
		int playerId = sc.nextInt();
		System.out.println("enter the updated score");
		int playerScore = sc.nextInt();

		for (int i = 0; i < playerDetailsArr.length; i++) {
			if (playerDetailsArr[i].getPlayerId() == playerId) {
				playerDetailsArr[i].setPlayerScore(playerScore);
				break;
			}
		}
		return playerDetailsArr;
	}

	// sort the array by using id in bubble sort
	public void sortPlayerDetailsById() {
		PlayerDetails temp = null;
		for (int i = 0; i < playerDetailsArr.length; i++) {
			for (int j = i + 1; j < playerDetailsArr.length; j++) {
				if (playerDetailsArr[i].getPlayerId() > playerDetailsArr[j].getPlayerId()) {
					temp = playerDetailsArr[i];
					playerDetailsArr[i] = playerDetailsArr[j];
					playerDetailsArr[j] = temp;
				}
			}
		}
	}

	// binary search
	public int binarySearch(int low, int high, int playerId) {
		if (high < low)
			return -1;
		int mid = (low + high) / 2;
		if (playerDetailsArr[mid].getPlayerId() == playerId)
			return mid;
		if (playerId > playerDetailsArr[mid].getPlayerId())
			return binarySearch((mid + 1), high, playerId);
		return binarySearch(low, (mid - 1), playerId);
	}

	public PlayerDetails searchPlayerDetailsById() {
		System.out.println("enter the player Id");
		int playerId=sc.nextInt();
		
		sortPlayerDetailsById();
		int low = 0;
		int high = playerDetailsArr.length;
		int indexOfSearchCar = binarySearch(low, high, playerId);

		return playerDetailsArr[indexOfSearchCar];
	}

	public void display(PlayerDetails[] playerDetailsArr) {
		for (int i = 0; i < currentArraySize; i++) {
			System.out.println(playerDetailsArr[i].getPlayerId() + " " + playerDetailsArr[i].getPlayerName() + " "
					+ playerDetailsArr[i].getPlayerAge() + " " + playerDetailsArr[i].getPlayerCountry() + " "
					+ playerDetailsArr[i].getPlayerScore());
		}
	}
	
	
	//insertion sort
	private static PlayerDetails[] sortPlayerDetailsByInsertionSort(PlayerDetails[] playerDetailsArr) {
		int tempScore, i, j;
		for (i = 1; i < currentArraySize; i++) {
			tempScore = playerDetailsArr[i].getPlayerScore();
			j = i - 1;

			while (j >= 0 && playerDetailsArr[j].getPlayerScore() > tempScore) {
				PlayerDetails temp = playerDetailsArr[j];
				playerDetailsArr[j] = playerDetailsArr[j + 1];
				playerDetailsArr[j + 1] = temp;
				j = j - 1;
			}
			playerDetailsArr[j + 1].setPlayerScore(tempScore);
		}
		return playerDetailsArr;
	}

	
	
	public static void main(String[] args) {
		PlayerService service=new PlayerService();
		Scanner sc1 = new Scanner(System.in);
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

			choice = sc1.nextInt();
			switch (choice) {
			case 1:
				PlayerDetails[] tempArray1=new PlayerDetails[currentArraySize];
				tempArray1 = service.takePlayerDetails();
				service.display(tempArray1);
				break;
			case 2:
				PlayerDetails[] tempArray2=new PlayerDetails[currentArraySize];
				  tempArray2 = service.updateScoreDetailsById();
				  service.display(tempArray2);
				break;
			case 3:
				//insertion sort
				PlayerDetails[] tempArray3=new PlayerDetails[currentArraySize];
				tempArray3 = service.sortPlayerDetailsByInsertionSort(playerDetailsArr);
				service.display(tempArray3);
				break;
			case 4:
				PlayerDetails temp=null;
				temp = service.searchPlayerDetailsById();
				System.out.println(temp.getPlayerId());
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
