package Adapter;

import java.rmi.RemoteException;

import Abstract.IPlayerCheckService;
import Entity.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {
		
		boolean control;
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			control = client.TCKimlikNoDogrula(Long.parseLong(player.getNationality()), player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getDateOfBirthday().getYear());
		} 
		
		
		catch (RemoteException e) {
			control = false;
			e.printStackTrace();
		}
		
		
		
		return control;
		
		
	}

}
