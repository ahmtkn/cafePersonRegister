package cafeServices;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheck check;
	
	public StarbucksCustomerManager(CustomerCheck check) {
		this.check = check;
	}
	
	public void saved(Customer customer) {
		if(check.checkPerson(customer)) {
			System.out.println("Müþteri Eklendi: " + customer.getFirstName());
		}else {
			System.out.println("Kayýt Ýþlemi Baþarýsýz");
		}
	}
}
