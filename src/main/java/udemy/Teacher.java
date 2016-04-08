package udemy;

public class Teacher extends Person {
	
	private String shcool;
	
	public Teacher(String teacherName, String teacherirthDate, String teacherSchool) {
		super(teacherName, teacherirthDate);
		shcool = teacherSchool;
		// TODO Auto-generated constructor stub
	}
	@Override	
	public void printInfo(){
		System.out.println("I teacher " + getBirthDate()+" name is " + getName()+" school " + shcool);
	}


	public static void main(String[] args) {
		new Teacher("Ellen", "12.10.2001", "PPPP").printInfo();;
		
	}
}
