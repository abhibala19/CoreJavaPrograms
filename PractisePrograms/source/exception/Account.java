package exception;

import java.math.BigDecimal;

public class Account {
BigDecimal balance;
String owner;
public Account(String owner,BigDecimal balance) {
	if (owner == null || owner.trim().equals("")) {
		throw new IllegalArgumentException("give proper name to the person");
	} else

	this.owner = owner;
	if(balance==null || balance.doubleValue()<0)
	{
		throw new IllegalArgumentException("dont give non existing money");
	}
	this.balance = balance;

}
public BigDecimal getBalance() {
	return balance;
}
public void setBalance(BigDecimal balance) {
	if(balance==null || balance.doubleValue()<0)
	{
		throw new IllegalArgumentException("dont give non existing money");
	}
	this.balance = balance;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	if (owner == null || owner.trim().equals("")) {
		throw new IllegalArgumentException("give proper name to the person");
	} else

	this.owner = owner;
}
public void debit(BigDecimal amt) throws NotEnoughMoneyInAccountException
{
	if(amt==null || amt.doubleValue()<0)
	{
		throw new IllegalArgumentException("dont give non existing money");

	}
	if(balance.doubleValue()<amt.doubleValue())
	{
		throw new NotEnoughMoneyInAccountException(" hi "+owner+" your balance is "+balance.doubleValue()+" is less than the amt "+amt.doubleValue()+" you are going to debit");
	}
	balance=balance.subtract(amt);
	
	
}
public void credit(BigDecimal amt)
{
	if(amt==null || amt.doubleValue()<0)
	{
		throw new IllegalArgumentException("dont give non existing money");

	}
	balance=balance.add(amt);

}
public BigDecimal checkBalance()
{
	return balance;
}

}
