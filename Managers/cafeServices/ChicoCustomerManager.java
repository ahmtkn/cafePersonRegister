package cafeServices;

public class ChicoCustomerManager extends BaseCustomerManager {
	
	public void saved(Customer customer) {
		System.out.println("Müþteri Eklendi: " + customer.getFirstName() + " " + "Doðum Yýllýnýz: " + customer.getDateOfBirth());
	}

}
