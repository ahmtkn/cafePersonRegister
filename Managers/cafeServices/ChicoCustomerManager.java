package cafeServices;

public class ChicoCustomerManager extends BaseCustomerManager {
	
	public void saved(Customer customer) {
		System.out.println("M��teri Eklendi: " + customer.getFirstName() + " " + "Do�um Y�ll�n�z: " + customer.getDateOfBirth());
	}

}
