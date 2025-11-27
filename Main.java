 
public class Main {

	public static void main(String[] args) {
		Student arturo = new Student(null, null, 0, 0, 0);
		arturo.firstName = "Arturo";
		arturo.lastName = "Diaz";
		arturo.grade = 82;
		arturo.year = 2;
		
		
		arturo.printFullName();
		System.out.println(arturo.isApproved());
	}
		
	
}


