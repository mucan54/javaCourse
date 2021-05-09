package Adapters;

import Abstract.GamerCheckService;
import Entities.Concrete.Gamer;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		System.out.println("Gamer validated via Mernis!");
		return true;
	}
}