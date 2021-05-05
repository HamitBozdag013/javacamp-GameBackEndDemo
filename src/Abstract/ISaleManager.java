package Abstract;

import Entity.Campaing;
import Entity.Game;
import Entity.Player;

public interface ISaleManager {
	
	void buy(Player player, Game game, Campaing campaing);

}
