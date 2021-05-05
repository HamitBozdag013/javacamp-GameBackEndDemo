import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Concrete.CampaingManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entity.Campaing;
import Entity.Game;
import Entity.Player;

public class Main {

	public static void main(String[] args) {
		
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		Player player = new Player(1, "Hamit", "Bozdað", LocalDate.of(1989, 10, 2), "52516400508");
		playerManager.add(player);
		
		
		Game game = new Game(1, "PES 2021", 2020, 280);
		
		
		CampaingManager campaingManager = new CampaingManager();
		Campaing campaing = new Campaing(202101,"Mayýs Ilk Hafta", 20);
		campaingManager.add(campaing);
		
		SaleManager saleManager = new SaleManager();
		saleManager.buy(player, game, campaing);
		
		

	}

}
