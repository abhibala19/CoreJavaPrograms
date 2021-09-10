package exception;

public class ATM {
	
public void withDraw(Card c,double amt) throws NotEnoughMoneyInCardException
{
	if(c==null)
		throw new IllegalArgumentException("card is null");
	if(amt<0)
	{
		throw new IllegalArgumentException("don't give non existing money");
	}
	if(c.getBalance()<amt)
		throw new NotEnoughMoneyInCardException("you have less money "+c.getBalance()+" than the amt "+amt+" you going to withdraw");
	c.setBalance(c.getBalance()-amt);
	
}
}
