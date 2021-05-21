package Concretes;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Campaign added : " + campaign.getName());
		System.out.println("Campaign price : " + campaign.getDiscountPrice());
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Campaign deleted : " + campaign.getName());
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Campaign updated : " + campaign.getName());
	}

}
