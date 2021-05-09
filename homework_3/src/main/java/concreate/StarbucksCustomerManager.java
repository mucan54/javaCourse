package concreate;

import abstracts.CustomerCheckService;
import abstracts.CustomerManager;
import entities.Customer;

public class StarbucksCustomerManager extends CustomerManager   {
	
	private CustomerCheckService customerCheckService;
	
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer){
		
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Yanlış Tc Girilmiş Kullanıcı:"+customer.getFirstName()+" "+customer.getLastName());
		}

	}

}