import java.util.*;
public class Credit {

	private String firstName;
	private String lastName;
	private int creditAmount;

	public Credit(String firstname, String lastname, int creditAmount) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.creditAmount = creditAmount;

	}

	public void registerCredit() {
		// ask for a firstname and lastname
		// also choose amount of money that client want 
		// and time (1year, 2 year , 3 year)
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();

		System.out.println("Enter yout lastname: ");
		String lastname = input.nextLine();

		System.out.println("Enter the credit amount(The interest rate is 10.5%: ");
		double amountOfCredit = input.nextDoubles();

		

	}

	public void checkCredit() {
		//verify name, lastname , balance
		



	}

	public void payCredit() {
		//
		
	}

}