package testPackage;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog bily = new Dog();
		bily.setName("Bily");
		System.out.println(bily.getName());
		
		bily.setWeight(-1);
		bily.digHole();
		
		System.out.println(bily.getSound());
		

	}

}
