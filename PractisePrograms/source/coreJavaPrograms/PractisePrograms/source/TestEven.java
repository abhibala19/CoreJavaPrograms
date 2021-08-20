package coreJavaPrograms.PractisePrograms.source;
public class TestEven
{
    public static void main(String[] args)
    {
        repeatNoOfTimes(8);
    }
    public static void repeatNoOfTimes(int num)
    {
        if(isEven(num))
        {
            print("shambo", num);
        }
        else
        {
           print("govinda", num);
        }
    }

    public static void print(String key, int num) {
        for(int i=0;i<=num;i++)
            {
                System.out.println(key);
            }
    }

    public static boolean isEven(int num){
        return (num&1)==0;
    }

}