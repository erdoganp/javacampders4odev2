package javacampders4odev2.Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import javacampders4odev2.Abstract.CustomerCheckService;
import javacampders4odev2.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService	 {

	@Override
	public boolean validate(Customer customer) {
	
		KPSPublicSoapProxy client =new KPSPublicSoapProxy();
		boolean result =false;
		
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getName().toUpperCase(new Locale("tr")), 
					customer.getName().toUpperCase(new Locale("tr")), customer.getDateOfBirth());
			
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		
		
		return result;
	}

}
