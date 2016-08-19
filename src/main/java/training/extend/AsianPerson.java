package training.extend;

public class AsianPerson extends Person {
	
	private int partyMemberID;
	
	public AsianPerson(String name, int age, int id) {
		super(name, age);
		partyMemberID = id;
	}
	
	public void printA() {
		System.out.println("(A) AsianPerson: " + name + " - " + age + " -> " + partyMemberID);
	}

	public void printPartyID() {
		System.out.println("(PartyID) AsianPerson: " + name + " -> " + partyMemberID);
	}
	
}
