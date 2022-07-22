package org.generation;

public class Employee extends Person {
	private String dapartment;
	private double salary;
	
	public Employee(String name, String email, int age, String rfc, String address, String dapartment, double salary) {
		super(name, email, age, rfc, address);
		this.dapartment = dapartment;
		this.salary = salary;
	}//constructor

	public double calculateSalary() {
		return (this.salary*21)*1.16;
	}//calculate Salary
	
	public String printReceipt() {
		return "+============================================+\n"
				+ "| Recibo de " + getName() + "\n"
				+ "| Departamento " + getDapartment() + "\n"
				+ "| Total = $ " + calculateSalary() + "\n"
				+ "+========================================= +";
	}//printReceipt
	
	public String getDapartment() {
		return dapartment;
	}// getDepartment

	public void setDapartment(String dapartment) {
		this.dapartment = dapartment;
	}// setDepartment 

	public double getSalary() {
		return salary;
	}// getSalary

	public void setSalary(double salary) {
		this.salary = salary;
	}// setSalary

	
	@Override
	public void printInfo() {
		System.out.println("=========Employee========");
		System.out.println(this.toString());
		System.out.println("=========End========");
	}//printIfno
	
	@Override
	public String toString() {
		return "Employee [dapartment=" + dapartment + ", salary=" + salary + ", setAge()=" + setAge() + ", getRfc()="
				+ getRfc() + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getEmail()="
				+ getEmail() + ", getAge()=" + getAge() + "]";
	}//toString
	
	
	
	
}//class
