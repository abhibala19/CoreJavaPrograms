package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class GenerateRandomString
{
    public static void main(String[] args)
    {
        String[] s=new String[5];
        s[0]="blue";
        s[1]="yellow";
        s[2]="green";
        s[3]="orange";
        s[4]="white";
        for(int i=0;i<5;i++)
        {
            int a=(int)(Math.random()*5);
            System.out.println(s[a]);
        }
    }
}