public class PowerOfTwo
{
    public static void main(String[] args)
    {
        for(int i=0;i<78;i++){
        String s=isPowerOfTwo(i);
        System.out.println("the no "+i+"is power of two"+s);
        }
    }
    public static String isPowerOfTwo(int num)
    {
        if((num&1)!=0)
        return "no";
        if(num<0)
        return "invalid";
        if(num==1|num==4|num==8)
        return "yes";
        int sum=1;

        for(int i=0;i<=num;i++)
        {
        //    for(int j=0;j<=i;j++)
        //    {
               sum=sum*2;
               if(sum>num)
               return "no";
               if(sum==num)
               return "yes";
               
                              
        //    }

        }
        return "size";
    }
}