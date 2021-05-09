package ;

import Abstract.BaseCampaignManager;
import Abstract.BaseGameManager;
import Abstract.BaseGamerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;

public class Main {

	public static void main(String[] args) throws Exception {
	
		BaseGameManager baseGameManager=new GameManager();
		BaseGamerManager baseGamerManager=new GamerManager(new MernisServiceAdapter());
		BaseCampaignManager baseCampaignManager=new CampaignManager();
		
		Gamer gamer=new Gamer(1,"11111111111", "B��ra", "Uyla�", 1998);
		baseGamerManager.add(gamer);
		Game game=new Game(1,"Detroit:Become Human","Action",100);
		baseGameManager.add(game);
		Campaign campaign=new Campaign(1, "The boss going crazy", 30);
		baseCampaignManager.add(campaign);
		
		baseGameManager.sell(game, gamer, campaign);
	}
}