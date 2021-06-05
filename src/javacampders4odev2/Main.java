package javacampders4odev2;

import javacampders4odev2.Abstract.BaseCustomerManager;
import javacampders4odev2.Adapters.MernisServiceAdapter;
import javacampders4odev2.Concrete.SturbucksCustomerManager;
import javacampders4odev2.Entities.Customer;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Customer customer =new Customer(1,"Erdogan","Pacaci",1991,"32044478620");
		
		BaseCustomerManager baseCustomerManager=new SturbucksCustomerManager(new MernisServiceAdapter());
		
		baseCustomerManager.save(customer);

	}

}
