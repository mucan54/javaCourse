package homework_1;

public class CourseManager {
	
	public void JoinCourse(Student student, Course course) {
		System.out.println("Sayın "+student.getFullName()+", "+course.getName()+" "+course.getDescription()+" kursuna kaydınız alındı.");
	}
	
	public void RemoveCourse(Student student, Course course) {
		System.out.println("Sayın "+student.getFullName()+", "+course.getName()+"  "+course.getDescription()+" kursundan kaydınız silindi.");
	}

}
