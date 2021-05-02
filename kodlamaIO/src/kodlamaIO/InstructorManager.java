package kodlamaIO;

public class InstructorManager extends UserManager {
	
	public void login(Instructor instructor) {
		System.out.println("Giriþ yaptýnýz : " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void logout(Instructor instructor) {
		System.out.println("Çýkýþ yaptýnýz : " + instructor.getFirstName() + " " + instructor.getLastName());
	}

}
