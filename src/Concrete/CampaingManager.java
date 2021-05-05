package Concrete;

import Abstract.ICampaingManagerService;
import Entity.Campaing;

public class CampaingManager implements ICampaingManagerService{

	@Override
	public void add(Campaing campaing) {
		
		System.out.println("Add new campaing : " + campaing.getCampaingName());
		
	}

	@Override
	public void update(Campaing campaing) {
		
		System.out.println("Updated campaing : " + campaing.getCampaingName());
		
	}

	@Override
	public void delete(Campaing campaing) {
		
		System.out.println("Deleted campaing : " + campaing.getCampaingName());
		
	}
	
	

}
