package com.day7assignment;

public class Main2 {

	public static void main(String[] args) {
		Student std1 = new Student();
		Hosteller hosteller = new Hosteller(20000.00);
		DayScholar dayScholar = new DayScholar(2500.00);
		
		dayScholar.transportFee();
		System.out.println("Total remaining amount: "+dayScholar.payFee(10000));
		
		hosteller.hostelFee();
		System.out.println("Total remaining amount: "+ hosteller.payFee(120000));
	}

}

class Student{
	int studId;
	String studName;
	double examFee;
	
	public void displayDetails() {
		System.out.println("ID: "+studId);
		System.out.println("Name: "+studName);
	}
	
	public double payFee(double fee) {
		return (examFee-fee);
	}
	
	Student(){};
	
	public Student(int studId, String studName, double examFee) {
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
	
	
}

class DayScholar extends Student{
	double transportFee;

	public DayScholar(double transportFee) {
		this.transportFee = transportFee;
	}
	
	public void transportFee() {
		transportFee = examFee + transportFee;
	}
	
	@Override
	public double payFee(double fee) {
		return (fee-transportFee);
	}
	
}

class Hosteller extends Student{
	double hostelFee;
	
	public Hosteller(double hostelFee) {
		this.hostelFee = hostelFee;
	}
	
	public void hostelFee() {
		hostelFee = examFee + hostelFee;
	}
	@Override
	public double payFee(double fee) {
		return (fee-hostelFee);
	}
	
}