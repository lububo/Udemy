package testPackage;


public class Animal {
	
	private String name;
	private int weight;
	private String sound;
	
	
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	
	public void setWeight(int newWeight) {
		if (newWeight >0){
				this.weight = newWeight;}
	else{System.out.println("Weight must be bigger");
	}
	}
	public int getWeight() {return weight;}
	
	public void setSound(String sound) {this.sound = sound;}
	public String getSound() {return sound;}

	
	
		


}
