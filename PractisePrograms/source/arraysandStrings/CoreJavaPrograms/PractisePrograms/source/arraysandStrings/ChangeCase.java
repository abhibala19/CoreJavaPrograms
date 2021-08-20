package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class ChangeCase
{
    public static void main(String[] args)
    {
        changeCase(args[0]);
    }
    public static void changeCase(String a)
    {
        String t="";
        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(Character.isUpperCase(c))
            {
                 t=t+Character.toLowerCase(c);
            }
            if(Character.isLowerCase(c))
            {
                t=t+Character.toUpperCase(c);
            }
        }
        System.out.println(t);
    }
}