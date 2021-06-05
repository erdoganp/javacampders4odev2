package javacampders4odev2.Abstract;


import javacampders4odev2.Entities.Customer;
import javacampders4odev2.Entities.Customer.*;

public interface CustomerCheckService {
	boolean validate(Customer customer);
}
