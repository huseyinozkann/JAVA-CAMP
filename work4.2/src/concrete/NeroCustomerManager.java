package concrete;

import abstracts.BaseCustomerManager;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager  {

	
	
	@Override
	public void save(Customer customer) {
		System.out.println("Customer saved to database : " + customer.getFirstName());
	}
	 
}
