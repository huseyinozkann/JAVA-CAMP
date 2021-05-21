package Concretes;

import Abstracts.SaleService;
import Entities.Campaign;
import Entities.Sale;

public class SaleManager implements SaleService {

	@Override
	public void addToSale(Sale sale) {
		
		System.out.println(sale.getGamer().getFirstName() + " gamer, bought " + sale.getGame().getName()+ " game.");
	}

	@Override
	public void addToCampaignSale(Sale sale, Campaign campaign) {
		
		System.out.println(sale.getGamer().getFirstName() + " gamer, bought " + sale.getGame().getName()+
				             " game with " + campaign.getName() + " campaign." );
	}

}
