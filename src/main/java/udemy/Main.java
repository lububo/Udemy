package udemy;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
//
//		String userName = "lily";
//		int userAge1 = 10, userAge2 =30, userAge3 = 50; 
////		
//		Student student1 = new Student("Pepi", "12.12.2001", "4.0");
//		student1.printInfo();
//		
//		Teacher teacher1 = new Teacher("Mili", "01.02.1950", "Slaveikov");
//		teacher1.printInfo();
//		
//		Person person1 = new Person("Adam","15.21.2654");
//		person1.printInfo();
//		
//		new Teacher("Ellen", "12.10.2001", "PPPP").printInfo();
//		
//		Person[] myPersons =
//			{ 
//				new Teacher("Ellen", "12.10.2001", "PPPP"),
//				new Teacher("Mili", "01.02.1950", "Slaveikov"),
//				new Student("Pepi", "12.12.2001", "4.0")
//			};
//		for (int i = 0; i < myPersons.length; i++) {
//			myPersons[i].printInfo();
//		}
		Date mAssignmentDueDate = new Date();
		Assignment joeyAssignment = new Assignment("Homework", "Math", mAssignmentDueDate);
		
		Student Joey = new Student("Joey", "10.12.1890", 123);
		Joey.setCurrentAssignment(joeyAssignment);
		Joey.printAssignmentInfo();
	//	Joey.printInfo();
		//System.out.println(Joey);
	}
	
}
