package com.day7assignment;
import java.util.Scanner;

public class Main4 {
	
	public static Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("axis")) {
			AxisBank axisBank = new AxisBank();
			return axisBank;
		}
		else if(bank.equalsIgnoreCase("icici")) {
			ICICIBank iciciBank = new ICICIBank();
			return iciciBank;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Bank Name");
		String  bankname = scanner.next();
		System.out.println("Enter Branch Name");
		String branchString = scanner.next();
		System.out.println("Ifsc code");
		String ifscString = scanner.next();
		System.out.println("Rate of interest");
		double rateofinterest = scanner.nextDouble();
		
		Object object = getBank(bankname);
		
		if(object.toString().equals("com.day7assignment.AxisBank@2acf57e3")) {
			AxisBank axisBank = new AxisBank(branchString,ifscString,rateofinterest);
			axisBank.displayDetails();
			axisBank.getCreditCard();
		}
		else if(object.toString().equals("com.day7assignment.ICICIBank@2acf57e3")) {
			ICICIBank iciciBank = new ICICIBank(branchString,ifscString,rateofinterest);
			iciciBank.displayDetails();
		}
	}

	
}


class Bank{
	String branchName;
	String ifscCode;
	Bank(){
		
	}
	Bank(String branchName, String ifscCode) {
		this.branchName = branchName;
		this.ifscCode = ifscCode;
	}
	
	public void displayDetails() {
		System.out.println("Branch Name: "+branchName);
		System.out.println("Ifsc Code: "+ifscCode);
	}
	
	
}
class AxisBank extends Bank{
	double rateOfInterest;
	AxisBank() {
		// TODO Auto-generated constructor stub
	}
	AxisBank(String branchName, String ifscCode, double rateOfInterest){
		super(branchName,ifscCode);
		this.rateOfInterest = rateOfInterest;
	}
	@Override
	public void displayDetails() {
		System.out.println("Branch Name: "+branchName);
		System.out.println("Ifsc Code: "+ifscCode);
		System.out.println("Rate of Interest: "+rateOfInterest);
	}
	
	public void getCreditCard() {
		System.out.println("Get the credit card from the Axis Bank");
	}
	
}
class ICICIBank extends Bank{
	double rateOfInterest;
	ICICIBank() {
		// TODO Auto-generated constructor stub
	}
	ICICIBank(String branchName, String ifscCode, double rateOfInterest){
		super(branchName,ifscCode);
		this.rateOfInterest = rateOfInterest;
	}
	@Override
	public void displayDetails() {
		System.out.println("Branch Name: "+branchName);
		System.out.println("Ifsc Code: "+ifscCode);
		System.out.println("Rate of Interest: "+rateOfInterest);
	}
}