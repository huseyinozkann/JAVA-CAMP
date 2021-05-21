package Abstracts;

import Entities.Campaign;
import Entities.Sale;

public interface SaleService {
    
	 void addToSale(Sale sale);
	 void addToCampaignSale(Sale sale, Campaign campaign);
}
