package cafeServices;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setFirstName("Ahmet");
		customer.setLastName("Tekin");
		customer.setNationalIdentity("12345678912");
		customer.setDateOfBirth("2000");
		
		BaseCustomerManager manager = new StarbucksCustomerManager(new CustomerCheckManager());
		manager.saved(customer);
		
		
		
	}

}
