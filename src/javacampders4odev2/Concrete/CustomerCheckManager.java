package javacampders4odev2.Concrete;

import javacampders4odev2.Abstract.CustomerCheckService;

import javacampders4odev2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean validate(Customer customer) {
		System.out.println("kullanýci gercek");
		return true;
	}

}
