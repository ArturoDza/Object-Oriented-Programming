
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
	       
	       public Student(String firstName, String lastName) {
	    	    this.firstName = firstName;
	    	    this.lastName = lastName;
	    	}//costructor
	       
	       
	       public void printFullName() {
	    	     System.out.println(firstName + " " + lastName);
	    	 }//FulName
	      
	       public boolean isApproved() {
	           return grade >= 60;
	          
	       }//isApproved

	       
	       public int changeYearIfApproved() {
	           if (grade >= 60) {
	               year = year + 1;
	               System.out.println("Congratulations!");
	           }
	           return year;
	       }//changeYearIf
	       

	       
 }//class student
 



