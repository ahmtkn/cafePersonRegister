package cafeServices;

public class CustomerCheckManager implements CustomerCheck{

	@Override
	public boolean checkPerson(Customer customer) {
		if (customer.getFirstName() != null && customer.getDateOfBirth().length() == 4 && customer.getNationalIdentity().length() == 11) {
			System.out.println("Kontrol baþarýlý");
			return true;
		}else {
			return false; 
		}
		
		
	}

}
