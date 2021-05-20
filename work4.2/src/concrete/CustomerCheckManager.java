package concrete;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		
		return false;
	}

}
