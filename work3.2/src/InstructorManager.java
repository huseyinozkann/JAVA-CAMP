
public class InstructorManager extends UserManager {
	
	public void addCourse(Instructor instructor) {
		
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()+ ", " + instructor.getCourseName() + " added.");
		
	}

}
