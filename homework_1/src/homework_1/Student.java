package homework_1;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	
	public Student() {
		System.out.println("Student Created.");
	}

	public Student(int id, String firstName, String lastName) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		
		return this.firstName+" "+this.lastName;
	}
	
	
}
