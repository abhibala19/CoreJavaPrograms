package CoreJavaPrograms.PractisePrograms.source.inheritance.account;

public class Person {
private String name;
private Account account;
public Person(String s,Account account) {
	if(s==null || s.trim().equals(""))
	{
		throw new IllegalArgumentException("give valid name");
	}
	else
		name=s;
	if(account==null)
	{
		throw new IllegalArgumentException("give valid name");

	}
	else
		this.account=account;
	// TODO Auto-generated constructor stub
}public Person() {
	// TODO Auto-generated constructor stub
}
public void withDraw(double amt)
{
	account.withDraw(amt);
}
public void deposit(double amt)
{
	account.deposit(amt);
}
public double checkBalance()
{
return account.checkBalance();
}
public void buyAnItem(String s,double amt)
{
	if(amt>account.getBalance())
		throw new IllegalArgumentException("you dont have enough money to buy an item");
	else
		System.out.println("you bought an item "+s);
		account.withDraw(amt);
}
}
