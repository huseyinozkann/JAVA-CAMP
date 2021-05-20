
public class StudentManager extends UserManager {
	
    public void takenCourse(Student student) {
        	
    	System.out.println(student.getFirstName() + " " + student.getLastName() + ", " + student.getEnrolledCourse() + " added." );
    	
        }
    
}


