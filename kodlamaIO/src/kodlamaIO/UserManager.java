package kodlamaIO;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kaydýnýz oluþturuldu : " + user.getFirstName() + " " +user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kaydýnýz silindi : " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Kaydýnýz güncellendi : " + user.getFirstName() + " " + user.getLastName());
	}

}
