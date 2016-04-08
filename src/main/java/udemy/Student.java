package udemy;

public class Student extends Person{

	private int mGpa;
	private Assignment mCurrentAssignment;
	
	public Student(String studentName, String studentBirthDate, int gpa) {
		super(studentName, studentBirthDate);
		mGpa = gpa;
		
		
	}
@Override	
	public void printInfo(){
		System.out.println("Ala Bala Student"+ getName()+ " , is "+getBirthDate()+ "ages old and has GPA"+mGpa);
	}

	public void printAssignmentInfo(){
		if (mCurrentAssignment !=null){
			
			System.out.println(mCurrentAssignment.getmName()+" , Due Date "+ mCurrentAssignment.getmAssinmnetDueDate());
		}
	}
	public void setCurrentAssignment(Assignment assignment){
		mCurrentAssignment = assignment;
	}

}
