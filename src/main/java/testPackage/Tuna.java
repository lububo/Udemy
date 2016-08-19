package testPackage;

import java.util.Scanner;

public class Tuna {
	private String girilName;
	
	public void setName(String name){
		girilName=name;
	}
	public String getName(){
		return girilName;
	}
	public void saying(){
		System.out.printf("Your firs gf is %s", getName());
	}

}
