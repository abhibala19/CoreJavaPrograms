package CoreJavaPrograms.PractisePrograms.source.inheritance.account;

import java.math.BigDecimal;

public class BankAccount extends Account {
private double minBalance=3000;
private double maxBalance=2000000;
public BankAccount(double balance) {
	super(balance);
	if(balance>minBalance && balance<maxBalance)
	{
		setBalance(balance);
	}
}
public void withDraw(double amt)
{
	if((getBalance()+amt)>minBalance)
	{
		setBalance(getBalance()-amt);
	}
	else
		System.out.println("your account doesnot have enough money");
}
public void deposit(double amt)
{
	if((getBalance()+amt)<maxBalance)
	{
		setBalance(getBalance()+amt);
	}else
		System.out.println("your account will hold maximum amt is "+maxBalance+" deposit within that amt");

	
}

}

