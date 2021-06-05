package javacampders4odev2.Concrete;

import javacampders4odev2.Abstract.BaseCustomerManager;
import javacampders4odev2.Abstract.CustomerCheckService;
import javacampders4odev2.Entities.Customer;

public class SturbucksCustomerManager  extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public SturbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.validate(customer)) {
			
			System.out.println("Mermis ilem giris basarili");
			this.save(customer);
		}else {
			System.out.println(customer.getName() + "kisi dogrulanamadý" );
		}
	}

}
