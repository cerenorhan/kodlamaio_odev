package kodlamaIO;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kayd�n�z olu�turuldu : " + user.getFirstName() + " " +user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kayd�n�z silindi : " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Kayd�n�z g�ncellendi : " + user.getFirstName() + " " + user.getLastName());
	}

}
