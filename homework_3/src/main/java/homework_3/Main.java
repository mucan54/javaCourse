package homework_3;

import abstracts.CustomerManager;
import adapters.MernisAdapter;
import adapters.TestAdapter;
import concreate.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisAdapter());
		customerManager.save(new Customer(1, "Ali", "Kara", 1990, "111111111111"));
		
		CustomerManager customerManager2 = new StarbucksCustomerManager(new TestAdapter());
		customerManager2.save(new Customer(1, "Veli", "Kara", 1990, "111111111111"));

	}

}