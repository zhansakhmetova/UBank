import java.util.*;
public class Deposit {

	private double balance;
	private double depositBalance;
	private double interestRate;
	private String name;

	public Deposit(double balance,double depositBalance,String name,double interestRate ){
		this.balance = balance;
		this.name = name;
		this.interestRate = interestRate;
		this.depositBalance = depositBalance;
	}


	public void createDeposit() {
		//create deposit for 1 year or 3 year
		//how to create deposit?
		depositBalance = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number of years for deposit:  ");
		int years = input.nextInt();


		

		
	}

	public void checkDeposit() {
		//check if it is enough money for first payment to deposit
		//first payment is 15000$

		if(balance = 15000){
			System.out.println("You have enough money to open deposit." + 
				"\n First payment of deposit is 15000$");
			System.out.println("Do you agree to make first payment(15000$)?");
			//Yes or No
			depositBalance = balance - 15000;

			
		}

		else {
			System.out.println("Sorry, but you can't open deposit. You don't have enough money on your account!");
		}
	}

	public double updateDeposit(int years) {
		double profit = balance;
		for(int i = 0; i < years; i++) {
			profit = profit + profit * interestRate / 100;
		}
		return profit - balance;
	}

	public String getName() {
		return name;
	}
}  