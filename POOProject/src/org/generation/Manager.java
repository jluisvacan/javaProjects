package org.generation;

public class Manager extends Employee {
	
	private int numberOfEmployees;
	private double percentage;
	public Manager(String name, String email, int age, String rfc, String address, String dapartment, double salary,
			int numberOfEmployees, double percentage) {
		super(name, email, age, rfc, address, dapartment, salary);
		this.numberOfEmployees = numberOfEmployees;
		this.percentage = percentage;
	}//constructor
	
	public double calculateSalary() {
		return super.calculateSalary()*(1+percentage);
	}//calculate Salary
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}//getNumberOfEmployees
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}//getNumberOfEmployees
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", percentage=" + percentage
				+ ", getNumberOfEmployees()=" + getNumberOfEmployees() + ", getPercentage()=" + getPercentage()
				+ ", getDapartment()=" + getDapartment() + ", getSalary()=" + getSalary() + ", setAge()=" + setAge()
				+ ", getRfc()=" + getRfc() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getEmail()=" + getEmail() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + "]";
	}
	
	

}
