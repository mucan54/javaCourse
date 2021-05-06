package homework_2;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		
		student.setId(1);
		student.setFirstName("Ali");
		student.setLastName("Kara");
		student.setEmail("ali@kara.com");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Veli");
		instructor.setLastName("Kara");
		instructor.setLesson("Java");
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.delete(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
	
	}

}
