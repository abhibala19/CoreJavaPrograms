package CoreJavaPrograms.PractisePrograms.source.inheritance.account;

import java.math.BigDecimal;

public class Account {
private double balance;
public Account() {
	// TODO Auto-generated constructor stub
}
public Account(double balance) {
	if(balance>0)
		this.balance=balance;

	else
		throw new IllegalArgumentException("give existing money");
	// TODO Auto-generated constructor stub
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	if(balance>0)
		this.balance=balance;
	else
		throw new IllegalArgumentException("give existing money");
	
}
public void withDraw(double amt)
{
	if(amt>0 && amt<balance)
	{
		balance=balance-amt;
	}
	else
		System.out.println("your account does not enough money to withdraw");
		
}
public void deposit(double amt)
{
	if(amt>0)
	{
		balance=balance+amt;
	}
	else
		System.out.println("give valid amount to deposit");
}
public double checkBalance()
{
	return balance;
}
}
