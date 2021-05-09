package abstracts;
import entities.Customer;

public  abstract class CustomerManager implements CustomerService {

	public void save(Customer customer) {

		System.out.println("Veritabanina kaydedildi: " + customer.getFirstName()+" "+customer.getLastName());
	}

}