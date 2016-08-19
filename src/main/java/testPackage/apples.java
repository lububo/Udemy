package testPackage;

import java.util.Scanner;

public class apples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tuna tunaObject = new Tuna();
		
		System.out.println("Enter gf Name:");
			String tempName =  input.nextLine();
		
		tunaObject.setName(tempName);
		tunaObject.saying();
	}

}
