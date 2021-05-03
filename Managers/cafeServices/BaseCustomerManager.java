package cafeServices;

public abstract class BaseCustomerManager implements BaseInterface,CustomerCheck {

	@Override
	public void saved(Customer customer) {
		System.out.println("Müþteri Eklendi: " + customer.getFirstName());
	}

	@Override
	public boolean checkPerson(Customer customer) {
		if (customer.getFirstName() != null && customer.getDateOfBirth().length() == 4 && customer.getNationalIdentity().length() == 11) {
			return true;
		}
		return false; 
		
	}

}
