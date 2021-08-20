package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class UseStringMethods
{
    public static void main(String[] args)
    {
        String s="abcdef";
        System.out.println(" the length of the String is "+s.length());
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            System.out.println(" the char at "+i+" index is "+c);
        }
        char[] ca=s.toCharArray();
        for(int j=0;j<ca.length;j++)
        {
            System.out.println(" the char at "+j+" index is "+ca[j]);
        }

        System.out.println(" upper case string is "+s.toUpperCase());
        System.out.println(" Lower case string is "+s.toLowerCase());
        String s1="a";
        System.out.println(" the two Strings are equals "+s.equals(s1));
        System.out.println(" which String is greater or smaller is "+s.compareTo(s1));
        boolean b=s.contains(s1);
        System.out.println(" string contains other string "+b);
        int a=s.indexOf(s1);
        System.out.println(" string contains other string at the indes "+a);
    }
}