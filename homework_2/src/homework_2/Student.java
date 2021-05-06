package homework_2;

public class Student extends User{
	
	private int studentNumber;
	
	Student(){}
	
	
	public Student(int id, String firstName, String lastName, String email, int studentNumber) {
		super(id,firstName,lastName,email);
		this.studentNumber = studentNumber;
	}

	public int studentNumber() {
		return this.studentNumber;
	}

	public void studentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
}