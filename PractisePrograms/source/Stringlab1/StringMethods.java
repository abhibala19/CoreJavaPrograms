package Stringlab1;
public class StringMethods
{
    public static void main(String[] args)
    {
        String s1="abcdeaaafghhibsd";
        String s2="a";
        String[] ar=s1.split("a");
        for(String s:ar)
        {
            System.out.println(s);
        }
        String s3="vishwamithre";
        for(int i=0;i<s3.length();i++)
        {
            for(int j=i+1;j<s3.length();j++)
            {
                System.out.println(s3.substring(i,j));
            }
        }
        int i=s1.length();
        char c=s1.charAt(5);
        System.out.println(c);
        System.out.println(s1.contains(s2));
        System.out.println(s1.indexOf(s2,0));
        System.out.println(s1.replace("ab","a"));
        System.out.println(s1.substring(3,7));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());




        System.out.println(s1.equals(s2));
        System.out.println(s1.concat(s2));
        
        

        


    }
}