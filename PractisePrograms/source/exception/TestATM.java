package exception;

public class TestATM {
public static void main(String[] args) {
	try
	{
		Card c=new Card("acno102",4000);
		ATM a=new ATM();
		a.withDraw(c, 9000);
	}
	catch(NotEnoughMoneyInCardException n)
	{
		System.out.println(n.getMessage());
	}
	catch(Throwable t)
	{
		System.out.println("in throwable");
	}
}
}
