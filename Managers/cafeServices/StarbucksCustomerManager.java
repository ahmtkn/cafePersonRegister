package cafeServices;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	public void saved(Customer customer) {
		if(checkPerson(customer)) {
			System.out.println("Kontrol baþarýlý");
			System.out.println("Müþteri Eklendi: " + customer.getFirstName());
		}else {
			System.out.println("Kayýt Ýþlemi Baþarýsýz");
		}
	}
	
}
