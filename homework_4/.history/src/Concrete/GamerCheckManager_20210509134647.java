package Concrete;

import Abstract.GamerCheckService;
import Entities.Concrete.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		return true;
	}
}