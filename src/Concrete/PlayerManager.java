package Concrete;

import Abstract.IPlayerCheckService;
import Abstract.IPlayerManager;
import Entity.Player;

public class PlayerManager implements IPlayerManager {
	
	
	private IPlayerCheckService playerCheckService;
	
	public PlayerManager(IPlayerCheckService playerCheckService) {
		
		this.playerCheckService = playerCheckService;
		
	}
	
	
	
	@Override
	public void add(Player player) {
		
		if(this.playerCheckService.CheckIfRealPerson(player))
		{
				
		System.out.println("Player Add : " + player.getFirstName());
		}
		
		else {
		
		System.out.println("Not valid player information");
		
		System.exit(0);
		
		}
	}

	@Override
	public void update(Player player) {
		
		System.out.println("Player Update : " + player.getFirstName());
		
	}

	@Override
	public void delete(Player player) {
		
		System.out.println("Player Delete : " + player.getFirstName());
		
	}

}
