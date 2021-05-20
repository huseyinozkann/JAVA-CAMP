package adapter;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		return client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
	}

}
