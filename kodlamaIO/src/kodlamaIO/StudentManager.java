package kodlamaIO;

public class StudentManager extends UserManager{
	
	public void login(Student student) {
		System.out.println("Giri� yapt�n�z : " + student.getFirstName() + " " + student.getLastName());
	}
	
	public void logout(Student student) {
		System.out.println("Giri� yapt�n�z : " + student.getFirstName() + " " + student.getLastName());
	}

}
