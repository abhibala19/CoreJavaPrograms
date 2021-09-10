package CoreJavaPrograms.PractisePrograms.source.inheritance.account;

import java.math.BigDecimal;

public class CreditCardAccount extends Account {
	private double minBalance = -1000.0;
	
	public CreditCardAccount(double balance) {
		super(balance);

	}

	public CreditCardAccount() {
		// TODO Auto-generated constructor stub
	}

	

	public void withDraw(double amt) {
		if ((getBalance()-amt)>= minBalance) {
			setBalance(getBalance()-amt);
		} else
			System.out.println("your account does not have enough money to withdraw");

	}

}
