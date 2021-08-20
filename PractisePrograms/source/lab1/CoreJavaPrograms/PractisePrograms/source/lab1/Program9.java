package CoreJavaPrograms.PractisePrograms.source.lab1;
public class Program9
{
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++)
        {
            if(((i%3==0)||(i%5==0))^((i%3==0)&&(i%5==0)))
            {
                System.out.println("divisible"+i);
            }
            
        }
    }
}