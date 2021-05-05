package Concrete;

import Abstract.ISaleManager;
import Entity.Campaing;
import Entity.Game;
import Entity.Player;

public class SaleManager implements ISaleManager {

	@Override
	public void buy(Player player, Game game, Campaing campaing) {
		
		System.out.println(player.getFirstName() + " named player " + game.getGameName() + "  your game " + campaing.getCampaingName() + " bought by benefiting from campaign.");
		
		
	}

	
}
