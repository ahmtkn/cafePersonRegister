package cafeServices;

public abstract class BaseCustomerManager implements BaseInterface {

	@Override
	public void saved(Customer customer) {
		System.out.println("M��teri Eklendi: " + customer.getFirstName());
	}


}
