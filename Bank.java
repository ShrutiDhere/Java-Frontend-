//use protected Access specifier

package Access_Specifier;

public class Bank {

	protected int id;
	protected String Account;
	
	protected Bank() {
		System.out.println("This is Government Bank");
	}
	
	protected void balance() {
		System.out.println("Balance is = 10,000 rs ");
	}
}
