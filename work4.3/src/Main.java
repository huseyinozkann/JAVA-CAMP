import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GamerManager;
import Concretes.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;

public class Main {

	public static void main(String[] args) throws Throwable {
	    
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Hüseyin");
		gamer.setLastName("Özkan");
        gamer.setDateOfBirth(LocalDate.of(2001, 4, 23));
        gamer.setNationalityId("11111111111");
        
        Game game = new Game();
        game.setId(1);
        game.setName("NBA 2K 21");
        game.setPrice(249.00);
        game.setType("SPORT");
        
        Campaign campaign = new Campaign();
        campaign.setId(1);
        campaign.setName("Game Time");
        campaign.setDiscountPrice(0);
        
        Sale sale = new Sale();
        sale.setId(1);
        sale.setGame(game);
        sale.setGamer(gamer);
        
        
        GameManager gameManager = new GameManager();
        gameManager.add(game);
        
        GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
        gamerManager.add(gamer);
        
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);
        
        SaleManager saleManager = new SaleManager();
        saleManager.addToSale(sale);
        
        SaleManager saleManagerCampaign = new SaleManager();
        saleManagerCampaign.addToCampaignSale(sale, campaign);
        
        		
        		
	}

}
