
 public class Student {
	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	       
	       public Student(String firstName, String lastName, int registration, int grade, int year) {
	           this.firstName = firstName;
	           this.lastName = lastName;
	           this.registration = registration;
	           this.grade = grade;
	           this.year = year;
	       }//costructor
	       
	       
	       public void printFullName() {
	    	     System.out.println(firstName + " " + lastName);
	    	 }
	      
	       public boolean isApproved() {
	           return grade >= 60;
	       }

	       
	       public int changeYearIfApproved(int grade, int year) {
	           if (grade >= 60) {
	               year = year + 1;
	               System.out.println("Congratulations!");
	           }
	           return year;
	       }
	       
 }//class student
 



