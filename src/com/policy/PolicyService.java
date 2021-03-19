//create policy class
//create a policy object array
//take policy details from user
//call constructor and add that to the policy object array
//display all policy details
//display policies whose premium fee is less than or equal to for given premium mode
//sort by number
//update premium fee details for given policy number
//exit

package com.policy;

import java.util.Scanner;

public class PolicyService {

	private final static int DEFAULT_SIZE = 2;
	Policy[] policyArr = new Policy[DEFAULT_SIZE];
	int currentArraySize = 0;
	Scanner sc = new Scanner(System.in);

	public void addPolicyToArray(Policy policy) {
		if (currentArraySize < policyArr.length) {
			policyArr[currentArraySize] = policy;
			currentArraySize++;
		} else if (currentArraySize == policyArr.length) {
			growArray();
			policyArr[currentArraySize] = policy;
			currentArraySize++;
		}
	}

	public void growArray() {
		int newSize = policyArr.length * 2;

		Policy[] tempArray = new Policy[newSize];
		for (int i = 0; i < currentArraySize; i++) {
			tempArray[i] = policyArr[i];
		}
		policyArr = tempArray;
	}

	public void takePolicyDetails() {
		System.out.println("enter the id of the policy");
		int id = sc.nextInt();
		System.out.println("enter the policy number");
		long policyNumber = sc.nextLong();
		System.out.println("enter the policy type");
		sc.nextLine();
		String policyType = sc.nextLine();
		System.out.println("enter the premium fee");
		double premiumFee = sc.nextDouble();
		System.out.println("enter the premium mode :1.quarterly 2.halfyearly 3.yearly");
		sc.nextLine();
		String premiumMode = sc.nextLine();
		if (premiumMode.contains("quarterly") || premiumMode.contains("halfyearly") || premiumMode.contains("yearly")) {
			Policy policy = new Policy(id, policyNumber, policyType, premiumFee, premiumMode);
			addPolicyToArray(policy);
		} else {
			System.out.println("enter the all policy details once again");
			takePolicyDetails();
		}
	}

	public void displayAllPolicyDetails() {
		for (int i = 0; i < currentArraySize; i++) {
			System.out.println(
					policyArr[i].getId() + " " + policyArr[i].getPolicyNumber() + " " + policyArr[i].getPolicyType()
							+ " " + policyArr[i].getPremiumFee() + " " + policyArr[i].getPremiumMode());
		}
	}

	// display all policies whose premium fee is less than or equal to given amount
	// for given mode
	public void searchByPremiumFeeAndPremiumMode() {
		System.out.println("enter the premium fee");
		double premiumFee = sc.nextInt();
		System.out.println("enter the premium mode");
		sc.nextLine();
		String premiumMode = sc.nextLine();

		for (int i = 0; i < currentArraySize; i++) {
			if (policyArr[i].getPremiumFee() <= premiumFee && policyArr[i].getPremiumMode().contains(premiumMode)) {
				System.out.println(
						policyArr[i].getId() + " " + policyArr[i].getPolicyNumber() + " " + policyArr[i].getPolicyType()
								+ " " + policyArr[i].getPremiumFee() + " " + policyArr[i].getPremiumMode());
			}
		}

	}

	// sort by policy number
	public void sortByPolicyNumber() {
		long[] policyNumber = new long[currentArraySize];

		for (int i = 0; i < currentArraySize; i++) {
			policyNumber[i] = policyArr[i].getPolicyNumber();
		}

		long temp = 0;
		for (int i = 0; i < currentArraySize; i++) {
			for (int j = 0; j < currentArraySize; j++) {
				if (policyNumber[i] < policyNumber[j]) {
					temp = policyNumber[i];
					policyNumber[i] = policyNumber[j];
					policyNumber[j] = temp;
				}
			}
		}

		for (int i = 0; i < currentArraySize; i++) {
			for (int j = 0; j < currentArraySize; j++) {
				if (policyNumber[i] == policyArr[j].getPolicyNumber()) {
					System.out.println(policyArr[j].getId() + " " + policyArr[j].getPolicyNumber() + " "
							+ policyArr[j].getPolicyType() + " " + policyArr[j].getPremiumFee() + " "
							+ policyArr[j].getPremiumMode());
					break;
				}
			}
		}
	}

	// update premium fee details for given policy number
	public void updatePremiumFeeByPolicyNumber() {
		System.out.println("enter policy number that u wanted to update the premium fee");
		long policyNumber = sc.nextLong();
		System.out.println("enter updated premium fee details");
		double premiumFee = sc.nextDouble();
		for (int i = 0; i < currentArraySize; i++) {
			if (policyArr[i].getPolicyNumber() == policyNumber) {
				policyArr[i].setPremiumFee(premiumFee);
				break;
			}
		}
	}
}