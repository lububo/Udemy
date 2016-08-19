package training.extend;

public class Person {
	
	protected String name;
	protected int age;
	
	public Person(String nameArg) {
		this(nameArg, 0);
	}
	
	public Person(String nameArg, int ageArg) {
		name = nameArg;
		age = ageArg;
	}
	
	public void printA() {
		System.out.println("(A) Person: " + name + " - " + age);
	}
	
	public void printB() {
		System.out.println("(B) Person: " + name + " - " + age);
	}
	
}
