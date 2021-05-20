

import java.rmi.RemoteException;
import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import concrete.NeroCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"Hüseyin","Özkan",LocalDate.of(2001, 4, 23),"19535639494"));
          
		
	}

}
