public abstract class Bank implements Verification, Payment {

	private int currentBalance;
	private int bonus;
	private Services services;
	private Notify notification;

	public Bank() {

	}

	public createUser(){

	}

	public registerCredit(){

	}

	public createDeposit(){

	}

	public boolean makeTransaction(){

	}

	public boolean verifyPhoneNumber(){
		if (phoneNumber != ) {
			return false
		}
		else {
			return true;
		}
	}

	public boolean verifyPassword(){
		if (password !=) {
			return false;
		}
		else {
			return true;
		}
	}

	public void pay(){

	}
}