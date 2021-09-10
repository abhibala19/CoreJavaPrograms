package exception;

import java.math.BigDecimal;

public class TestAccount {
public static void main(String[] args) {
	try
	{
		Account a=new Account("gopi", BigDecimal.valueOf(90000));
		a.debit(BigDecimal.valueOf(233988));
		a.credit(BigDecimal.valueOf(9889));

	System.out.println(a.checkBalance());
		
	}
	catch(NotEnoughMoneyInAccountException r)
	{
		r.printStackTrace();
		System.out.println(r.getMessage());
	}
}
}
