package adapters;

import abstracts.CustomerCheckService;
import tr.gov.nvi.tckimlik.utility.TcknUtility;
import entities.Customer;

public class TestAdapter implements CustomerCheckService {

	public boolean CheckIfRealPerson(Customer customer) {

		boolean result = true;

		return result;
	}

}