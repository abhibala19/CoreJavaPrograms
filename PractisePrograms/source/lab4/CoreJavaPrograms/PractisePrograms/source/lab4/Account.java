package CoreJavaPrograms.PractisePrograms.source.lab4;
public class Account
{
   private String accName;
    private String accNumber;
   private double balance;
   public void setAccName(String s)
   {
	   if(s==null && s.trim().equals("")) {
		   System.out.println("give valid name");
	   }
	   else
		   accName=s;
	   
   }
   public String getAccName()
   {
	   return accName;
   }
   public void setAccNumber(String a)
   {
	   if(a==null && a.trim().equals(""))
	   {
		   System.out.println("give valid number ");
	   }
	   else
		   accNumber=a;
   }
   public String getAccNumber() {
	   return accNumber;
   }
   
    public void setBalance(double amt)
    {
        if(amt>0)
        {
            balance=amt;
        }
    }
    public double getBalance()
    {
        return balance;
    }
    public void withdraw(double n)
    {
        if((balance>0)&&(balance>=n))
        {
            balance=balance-n;
            System.out.println("dear "+accName+"your accountnumber "+accNumber+"new balance is"+balance);
        }
        else
        {
            System.out.println("there is no enough money to withdraw");
        }
    }
    public void deposit(double money)
    {
        if(money>0)
        {
            balance=balance+money;
            System.out.println("dear "+accName+"your accountnumber "+accNumber+"new balance is"+balance);

        }
    }
}