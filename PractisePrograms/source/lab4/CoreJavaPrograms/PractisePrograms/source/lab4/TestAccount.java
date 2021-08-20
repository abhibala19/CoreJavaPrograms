package CoreJavaPrograms.PractisePrograms.source.lab4;
public class TestAccount
{
    public static void main(String[] args)
    {
    Account a=new Account();
   a.setAccName("ramu");
   a.setAccNumber("1234556");
    a.setBalance(5000.0);
    System.out.println(a.getBalance());
    a.withdraw(1000.0);
    a.deposit(2000.0);
    }
}