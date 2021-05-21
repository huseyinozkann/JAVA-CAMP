package Abstracts;

import Entities.Gamer;

public interface GamerService {
  
	void add(Gamer gamer) throws Throwable;
	void delete(Gamer gamer);
	void update(Gamer gamer) throws Throwable;
	
}
