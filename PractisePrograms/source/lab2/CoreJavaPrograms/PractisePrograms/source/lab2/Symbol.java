package CoreJavaPrograms.PractisePrograms.source.lab2;
public class Symbol
{
    public static void main(String[] args)
    {
        for(int i=0;i<=65535;i++)
        {
            if(i%5!=0)
            {
            System.out.print((char)i +" ");
            }
            else
               continue;
   
        }
    }
}