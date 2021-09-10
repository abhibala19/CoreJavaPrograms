package exception;

public class Card {
private String owner,accNum;
private double balance;
public Card(String owner,double balance) {
if(owner==null || owner.trim().equals(""))
	{
		throw new IllegalArgumentException("give valid name");
	}
	this.owner=owner;
	if(balance<0)
	{
		throw new IllegalArgumentException("don't give non existing money");
	}
	this.balance = balance;

}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	if(owner==null || owner.trim().equals(""))
	{
		throw new IllegalArgumentException("give valid name");
	}
	this.owner = owner;
}
public String getAccNum() {
	return accNum;
}
public void setAccNum(String accNum) {
	if(accNum==null)
	{
		throw new IllegalArgumentException("give existing account num");
	}
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	if(balance<0)
	{
		throw new IllegalArgumentException("don't give non existing money");
	}
	this.balance = balance;
}
public Card() {
	System.out.println("in csrd constr");
}
	

}
