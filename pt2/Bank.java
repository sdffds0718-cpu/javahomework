package pt2;

public class Bank {

	public static void main(String[] args) {
		BankAcount bk = new BankAcount();
	bk.deposit(10000);
	bk.show();
	
	bk.withdraw(20000);
	bk.show();
	bk.deposit(300000);
	bk.withdraw(50000);
	bk.show();
	

	}

}
