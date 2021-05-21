package Concretes;

import Abstracts.GamerCheckService;
import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	GamerCheckService gamerCheckService;
	
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) throws Throwable {
		
		if(gamerCheckService.chechIfRealPerson(gamer)) {
			
			System.out.println("Gamer added : " + gamer.getFirstName());
		}
		else {
			
			System.out.println("Gamer couldn't add");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Gamer deleted : " + gamer.getFirstName());
	}

	@Override
	public void update(Gamer gamer) throws Throwable {
		
		if(gamerCheckService.chechIfRealPerson(gamer)) {
			
			System.out.println("Gamer updated : " + gamer.getFirstName());
		}
		else {
			System.out.println("Gamer couldn't update");
		}
	}

}
