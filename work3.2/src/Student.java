
public class Student extends User {
	
	
	private String enrolledCourse;
	
	
	public Student() {
		
	}


	public Student(String enrolledCourse) {
		super();
		
		this.enrolledCourse = enrolledCourse;
	}

	public String getEnrolledCourse() {
		return enrolledCourse;
	}


	public void setEnrolledCourse(String enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}

	
	
	

}
