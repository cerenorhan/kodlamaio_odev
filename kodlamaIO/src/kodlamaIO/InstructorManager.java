package kodlamaIO;

public class InstructorManager extends UserManager {
	
	public void login(Instructor instructor) {
		System.out.println("Giri� yapt�n�z : " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void logout(Instructor instructor) {
		System.out.println("��k�� yapt�n�z : " + instructor.getFirstName() + " " + instructor.getLastName());
	}

}
