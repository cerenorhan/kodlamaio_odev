package kodlamaIO;

public class Instructor extends User {
	
	private String major;
	private String department;
	
	

	public Instructor(int id, String firtsName, String lastName, String email, String password, String major,
			String department) {
		super(id, firtsName, lastName, email, password);
		this.major = major;
		this.department = department;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

}
