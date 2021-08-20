package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class SwapFirstAndLastChar
{
    public static void main(String[] args)
    {
        String s=doSwapingOfFirstAndLastChar(args[0]);
        System.out.println("the string after swapping of first and last char "+s);
    }
    public static String doSwapingOfFirstAndLastChar(String a)
    {
        a=a.charAt(a.length()-1)+a.substring(1,a.length()-1)+a.charAt(0);
        return a;
    }
}