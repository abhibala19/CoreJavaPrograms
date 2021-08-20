package CoreJavaPrograms.PractisePrograms.source.lab3;
public class PowerOfTwo
{
    public static void main(String[] args)
    {
        for(int i=0;i<78;i++){
        String s=isPowerOfTwo(i);
        System.out.println("the no "+i+" is power of two "+s);
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
               sum=sum*2;
               if(sum>num)
               break;

                if(sum==num)
                return "yes";
        }
        return "no";
    }
}
