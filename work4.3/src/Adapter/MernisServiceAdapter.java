package Adapter;


import Abstracts.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean chechIfRealPerson(Gamer gamer) throws Throwable, Throwable {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth());
	}

}
