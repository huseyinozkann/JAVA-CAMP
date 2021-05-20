
public class Main {

	public static void main(String[] args) {
		
	
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("b");
		instructor1.setPassword("5684542");
		instructor1.setCourseName("JAVA + REACT");
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setFirstName("Hüseyin");
		student1.setLastName("Özkan");
		student1.setEmail("a");
		student1.setPassword("1256987");
		student1.setEnrolledCourse("JAVA + REACT");
		
		
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addUser(instructor1);
        instructorManager.addCourse(instructor1);
        
        StudentManager studentManager = new StudentManager();
        studentManager.addUser(student1);
        studentManager.takenCourse(student1);
        

	}

}
