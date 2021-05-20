package abstracts;

import java.rmi.RemoteException;

import entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws RemoteException {
		
		System.out.println("Customer saved to database : " + customer.getFirstName());
		
	}

}
