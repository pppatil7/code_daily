package com.policy;

public class Policy {

	int id;
	long policyNumber;
	String policyType;
	double premiumFee;
	String premiumMode;

	public Policy() {
		super();
	}

	public Policy(int id, long policyNumber, String policyType, double premiumFee, String premiumMode) {
		super();
		this.id = id;
		this.policyNumber = policyNumber;
		this.policyType = policyType;
		this.premiumFee = premiumFee;
		this.premiumMode = premiumMode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public double getPremiumFee() {
		return premiumFee;
	}

	public void setPremiumFee(double premiumFee) {
		this.premiumFee = premiumFee;
	}

	public String getPremiumMode() {
		return premiumMode;
	}

	public void setPremiumMode(String premiumMode) {
		this.premiumMode = premiumMode;
	}

	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyNumber=" + policyNumber + ", policyType=" + policyType + ", premiumFee="
				+ premiumFee + ", premiumMode=" + premiumMode + "]";
	}

}
