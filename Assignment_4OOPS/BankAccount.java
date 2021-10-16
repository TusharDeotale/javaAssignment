package oops;

public class BankAccount {

	String nameOfDepositer, accountType;
	int accountNumber, balanceAmount;

	void assignValue() {
		nameOfDepositer = "Tushar";
		accountType = "Saving";
		accountNumber = 123456890;
		balanceAmount = 20000;
	}

	int depositAmount() {
		int deposit = 5000;
		balanceAmount = balanceAmount + deposit;
		return deposit;
	}

	int withdrawAmount() {
		int withdraw = 1000;
		return withdraw;
	}

	void display() {
		System.out.println(nameOfDepositer);
		System.out.println("Balance Amount is = " + (balanceAmount - withdrawAmount()));
	}

	public static void main(String[] args) {

		BankAccount b = new BankAccount();
		b.assignValue();
		b.depositAmount();
		b.withdrawAmount();
		b.display();

	}

}
