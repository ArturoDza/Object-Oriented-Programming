 
public class Main {

	public static void main(String[] args) {
		Student arturo = new Student("Arturo", "Diaz", 100, 60, 2);
		Student jackie = new Student("Jackie", "Rivera", 101, 80, 1);
        Student carolina = new Student("Carolina", "Perez", 102, 90, 3);

        System.out.println("+-------------------------+");
		arturo.printFullName();
		System.out.println(arturo.isApproved());
		arturo.changeYearIfApproved();
		System.out.println("+-------------------------+");
		
		System.out.println("+-------------------------+");
		jackie.printFullName();
		System.out.println(jackie.isApproved());
		jackie.changeYearIfApproved();
		System.out.println("+-------------------------+");
		
		System.out.println("+-------------------------+");
		carolina.printFullName();
		System.out.println(carolina.isApproved());
		carolina.changeYearIfApproved();
		System.out.println("+-------------------------+");
		
		
		  
	}
}


