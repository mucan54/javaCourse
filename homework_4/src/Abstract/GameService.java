package Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;

public interface GameService {

	void add(Game game);
    void update(Game game);
    void delete(Game game);  
    void sell(Game game, Gamer gamer,Campaign campaign);
}