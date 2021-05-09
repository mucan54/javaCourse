package adapters;

import abstracts.CustomerCheckService;
import tr.gov.nvi.tckimlik.utility.TcknUtility;
import entities.Customer;

public class MernisAdapter implements CustomerCheckService {

	public boolean CheckIfRealPerson(Customer customer) {

		boolean result = false;

		try {
			result = TcknUtility.tcknDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDataOfBirth());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

}