package cafeServices;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	public void saved(Customer customer) {
		if(checkPerson(customer)) {
			System.out.println("Kontrol ba�ar�l�");
			System.out.println("M��teri Eklendi: " + customer.getFirstName());
		}else {
			System.out.println("Kay�t ��lemi Ba�ar�s�z");
		}
	}
	
}
