package Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;

public abstract class BaseGameManager implements GameService{
	
	@Override
	public void add(Game game)
    {
		System.out.println("Added Game: " + game.getName());
    }

	@Override
    public void delete(Game game)
    {
		System.out.println("Deleted Game: " + game.getName());
    }

	@Override
    public void update(Game game)
    {
    	System.out.println("Updated Game: " + game.getName());
    }
     
	@Override
    public void sell(Game game, Gamer gamer, Campaign campaign)
    {
		System.out.println(game.getName()+ " has been sold to " + gamer.getFirstName() + " " + gamer.getLastName());
    }
}