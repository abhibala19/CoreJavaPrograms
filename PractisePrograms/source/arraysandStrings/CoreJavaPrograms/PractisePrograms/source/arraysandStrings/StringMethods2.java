package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class StringMethods2
{
    public static void main(String[] args)
    {
        String s="abcdf";
        String s1="abcdf";
        // System.out.println(s.equalsIgnoreCase(s1));
        String s2=new String("abcdf");
        String s3=new String("abcdf");
        System.out.println(s2==s3);
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s));

        System.out.println(s1==s);
        System.out.println(s2==s);
    }
}