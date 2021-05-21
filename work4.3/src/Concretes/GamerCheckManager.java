package Concretes;

import Abstracts.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean chechIfRealPerson(Gamer gamer) throws Throwable, Throwable {
		
		return false;
	}

}
