package homework_4;

import Abstract.BaseCampaignManager;
import Abstract.BaseGameManager;
import Abstract.BaseGamerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.OrderManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;

public class Main {

	public static void main(String[] args) throws Exception {
	
		BaseGameManager baseGameManager=new GameManager();
		BaseGamerManager baseGamerManager=new GamerManager(new MernisServiceAdapter());
		CampaignManager baseCampaignManager=new CampaignManager();
		
		
		Gamer gamer=new Gamer(1,"11111111111", "Ali", "Kara", 1990);
		baseGamerManager.add(gamer);
		Game game=new Game(1,"CS:GO","FPS",100);
		baseGameManager.add(game);
		Campaign campaign=new Campaign(1, "İlk Sipariş İndirimi", 30);
		baseCampaignManager.add(campaign);
		
		OrderManager ordermanager = new OrderManager(game,gamer,campaign);
		ordermanager.Sell();
		
		OrderManager ordermanager2 = new OrderManager(game,gamer);
		ordermanager2.Sell();
		
	}
}