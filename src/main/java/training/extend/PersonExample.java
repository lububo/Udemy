package training.extend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PersonExample {
	
	public static void main(String[] args) {
		List<Person> persons = new LinkedList<>();//new ArrayList<>();
		
		
		persons.add(new Person("Sasho"));
		persons.add(new Person("Alex", 33));
		persons.add(new AsianPerson("Huan", 32, 2134));
		
			for (Person person : persons) {
			person.printA();
			person.printB();
			System.out.println();
		}
		
		AsianPerson a = new AsianPerson("Ma", 12, 222222);
		a.printA();
		a.printB();
		a.printPartyID();
	}
	
}
