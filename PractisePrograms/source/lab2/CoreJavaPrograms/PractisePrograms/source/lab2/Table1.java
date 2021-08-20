package CoreJavaPrograms.PractisePrograms.source.lab2;
public class Table1
{
    public static void main(String[] args)
    {
        int a=12;
        int b=5;
        printTable(a,b);
    }
       public static void printTable(int num , int num1)
        {
            int smaller;
            int larger;
            larger = (num>num1)? num : num1;
            smaller = (num>num1) ? num1: num;
            for(int x=1;x<=larger;x++)
            {
                 int c=x*smaller;
                System.out.println("the table of given num is "+x+" * "+smaller+" = "+c);            
            }
        }    
}