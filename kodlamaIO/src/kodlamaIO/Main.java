package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "Ceren", "Orhan", "corhan@yahoo.com", "123456789", 654);
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "engin123@gmail.com", "8635789", "Software Developer", "Computer Sciences");
		
		UserManager userManager = new UserManager();		
		userManager.add(student);
		userManager.delete(student);
		userManager.update(student);
		
		userManager.add(instructor);
		userManager.delete(instructor);
		userManager.update(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		studentManager.logout(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		instructorManager.logout(instructor);
		
		
		

	}

}
