package cafeServices;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheck check;
	
	public StarbucksCustomerManager(CustomerCheck check) {
		this.check = check;
	}
	
	public void saved(Customer customer) {
		if(check.checkPerson(customer)) {
			System.out.println("M��teri Eklendi: " + customer.getFirstName());
		}else {
			System.out.println("Kay�t ��lemi Ba�ar�s�z");
		}
	}
}
