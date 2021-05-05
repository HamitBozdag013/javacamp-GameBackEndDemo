package Concrete;

import Abstract.IPlayerCheckService;
import Entity.Player;

public class PlayerCheckManager implements IPlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {
		
		return true;
	}

}
