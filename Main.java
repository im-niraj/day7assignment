package com.day7assignment;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		
		employee.name = "Amir";
		employee.age = 25;
		employee.phone = "9453000001";
		employee.address = "Peeragarhi, New Delhi-110087";
		employee.salary = 20000.00;
		employee.department = "Accounting";
		employee.specialisation = "Data analysis";
		employee.printSalary();
		
		System.out.println(employee);
		
		
		manager.name = "Raj Shekhar";
		manager.age =32;
		manager.phone = "9695000001";
		manager.address = "Hosur, Tamilnadu";
		manager.salary = 60000.00;
		manager.department = "R&D";
		manager.specialisation = "Manager";
		manager.printSalary();
		System.out.println(manager);
	}

}

class Member{
	String name;
	int age;
	String phone;
	String address;
	double salary;
	
	
	public void printSalary() {
		System.out.println("Salary: "+salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class Employee extends Member{
	String specialisation;
	String department;
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [specialisation=" + specialisation + ", department=" + department + ", name=" + name + ", age="
				+ age + ", phone=" + phone + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
}
class Manager extends Member{
	String specialisation;
	String department;
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String toString() {
		return "Employee [specialisation=" + specialisation + ", department=" + department + ", name=" + name + ", age="
				+ age + ", phone=" + phone + ", address=" + address + ", salary=" + salary + "]";
	}
}