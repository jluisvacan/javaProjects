	   public class Student {
	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;      
	       	       
	       public Student(String firstName, String lastName, int registration, int grade, int year) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.registration = registration;
			this.grade = grade;
			this.year = year;
		}// constructor
	       	       
		public Student(String firstName, String lastName, int registration) {
			this(firstName, lastName, 0, 0, 2020);
		}// constructor

		public Student(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}


		public void printFullName(){
			      System.out.println("El nombre del estudiante es: " + firstName + " " + lastName);
			   }//printFullName

	       public boolean isApproved(){
	    	   if (this.grade >=60) {
				   return true;
			   } else {
				   return false;
			   	}//else
			   }//ifApproved

	       
	       public int changeYearIfApproved(){
			       if (isApproved()) {
			    	   year++;
			    	   System.out.println("Congratulations!!!");
			       }//if
			       return year;
			   }// changeYearIfApproved
	   }//classStudent


	