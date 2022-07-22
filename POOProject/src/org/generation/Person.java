package org.generation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.generation.utils.EmailFormatExcepion;

public class Person {

		private String name;
		private String email;
		private int age;
		private String rfc; // readOnly
		private String address;
		private static int total=0; 
		
		public Person(String name, String email, int age, String rfc, String address) {
			this.name = name.toUpperCase();
			this.email = email.toLowerCase();
			this.age = (age<18)?18:age;
			this.address = address;
			this.rfc=rfc.toUpperCase();
			Person.total ++;
		}//constructor
		
		public static int getTotal() {
			return Person.total;
		}
		
		
		public Person(String name, String email) {
			this (name, email, 0, "XAXX000000", "Domicilio conocido");
		}//constructor

	
		
		public void setEmail(String email) throws EmailFormatExcepion {
			Pattern regex = Pattern.compile("^[A-Z_0-9-%+-]+@[A-Z0-9.-]+\\.[A-Z{2,6}]", Pattern.CASE_INSENSITIVE);
			Matcher matcher = regex.matcher(email);
			this.email = "jdoe@hotmal.com";
			if	(matcher.matches()) {
				this.email = email;
			} else {
				throw new EmailFormatExcepion("Formato de correo invalido[" +  email + "]");
			}//if
		}//setEmail
		
			public void setAge(int age) {
				this.age = (age<20)?20:age;
			}// setAge
			
			public int setAge() {
				return this.age;
			}// setAge
			
			public String getRfc() {
				return this.rfc;
			}// getRfc
			
			public String getName() {
				return name;
			}// getName

			public void setName(String name) {
				this.name = name;
			}// setName

			public String getAddress() {
				return address;
			}// getAddress

			public void setAddress(String address) {
				this.address = address;
			}// setAddress

			public String getEmail() {
				return email;
			}// getEmail

			public int getAge() {
				return age;
			}// getAge

			public void printInfo() {
				System.out.println("=========Person========");
				System.out.println(this.toString());
				System.out.println("=========End========");
			}//printIfno


			
		@Override
		public String toString() {
			return "Person [name=" + name + ", email=" + email + ", age=" + age + ", rfc=" + rfc + ", address="
					+ address + "]";
			
		}//toString
		
	
}//class
