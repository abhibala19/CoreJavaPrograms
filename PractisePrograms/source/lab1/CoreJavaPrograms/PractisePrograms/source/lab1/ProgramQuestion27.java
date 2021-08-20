package CoreJavaPrograms.PractisePrograms.source.lab1;
public class ProgramQuestion27
{
    public static void main(String[] args)
    {
        char c='a';
        int i=c;
        System.out.println(i);//97
        for (int j=i;j<(i+25);j++)
        {
            c=(char)j;
            System.out.println(j + " "+c);
            
        }
    }
}