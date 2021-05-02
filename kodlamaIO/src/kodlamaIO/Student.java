package kodlamaIO;

public class Student extends User {
	
	private int studentNumber;

	

	public Student(int id, String firtsName, String lastName, String email, String password, int studentNumber) {
		super(id, firtsName, lastName, email, password);
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	

}
