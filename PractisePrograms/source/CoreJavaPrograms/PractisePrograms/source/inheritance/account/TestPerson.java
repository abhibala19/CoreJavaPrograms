package CoreJavaPrograms.PractisePrograms.source.inheritance.account;

import java.math.BigDecimal;

public class TestPerson {
public static void main(String[] args) {
	Account a=new BankAccount(30000);
	Account b=new CreditCardAccount(2500.0);
	Person p=new Person("balu",a);
	Person p2=new Person("gopu",b);
	p.withDraw(5000);
	System.out.println(p.checkBalance());
	p2.withDraw(1000);
	p2.withDraw(4);
	System.out.println(p2.checkBalance());
	p.buyAnItem("bag",2000);
	System.out.println(p.checkBalance());
	
	
//	a.deposit(3000);
//	b.withDraw(2500.0);
//	System.out.println(a.getBalance());
//	System.out.println(b.getBalance());
//	

	}

}
