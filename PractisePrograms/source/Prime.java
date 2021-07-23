public class Prime
{
    public static void main(String[] args)
    {
      String i= isPrime(99);
       System.out.println("the given is prime"+i);
    }

    public static String isPrime(int num)
    {
        if(num<0)
        return "invalid";
        if(num==0|num==1)
        return "no";
        if(num==2|num==3|num==5|num==7)
        return "yes";
        if ((num&1)==0)
        return "no";
        for(int a=3;a<=(num/2);a+=2)
        {
            if((num%a)==0)
            return "no";
        }
        return "yes";
    }
}