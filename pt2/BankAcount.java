package pt2;

public class BankAcount {
	private int balance;
static final int MIN = 0;
static final int MAX= 1000000;

void deposit (int m) {
	if (balance + m <= MAX) {
		balance += m;
		
	
		
	}
}
void withdraw (int m) {
	if (balance - m >= MIN) {
		balance -= m;
		
	}
	else { 
		System.out.println("잔액부족");
		
	}
}
	void show() {
		System.out.println("현재 잔액:" + balance + "입니다.");
}
}
