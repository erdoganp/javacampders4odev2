package javacampders4odev2.Abstract;

import javacampders4odev2.Entities.Customer;

public abstract class BaseCustomerManager  implements CustomerService{
	@Override
	public void save(Customer customer) {
		
		System.out.println("recorded DataBase "+  customer.getName());
	}
}
