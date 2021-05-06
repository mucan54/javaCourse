package homework_2;

public class UserManager {

	
	public void add(User user) {
		System.out.println(user.firstName + " " + user.lastName+ " " + "Isimli Kullanici Sisteme Eklendi.");
	}


	public void delete(User user) {
	System.out.println(user.firstName + " " + user.lastName+" "+ "Sistemden Silindi.");
	}
}
