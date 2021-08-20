package CoreJavaPrograms.PractisePrograms.source.lab2;
public class Table
{
    public static void main(String[] args)
    {
        int a=5;
        printTable(a);
    }
    public static void printTable(int num)
    {
        for(int i=1;i<=10;i++)
        {
            int table=i*num;
        System.out.println(i+" * "+num+ " = "+table);

        }
    }
}