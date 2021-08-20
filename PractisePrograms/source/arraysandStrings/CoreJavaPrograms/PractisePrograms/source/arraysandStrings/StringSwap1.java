package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class StringSwap1
{
    public static void main(String[] args)
    {
        String s1="abcd";
        String s2="pqrs";
        swapstring(s1,s2);
    }
    public static void swapstring(String a1,String a2)
    {
        int a=a1.length();
        int b=a2.length();
        if(a>b)
        {
          a2=a2+getSpace(a-b);            
        }
        if(a<b)
        {
            a1=a1+getSpace(a-b);
        }
        char[] ca1=a1.toCharArray();
        char[] ca2=a2.toCharArray();
        for(int i=0;i<ca1.length;i++)
        {
            ca1[i]=(char)(ca1[i]^ca2[i]);
            ca2[i]=(char)(ca1[i]^ca2[i]);
            ca1[i]=(char)(ca1[i]^ca2[i]);
        }
        a1=new String(ca1);
        a2=new String(ca2);
        System.out.println("s1= "+a1);
        System.out.println("s2= "+a2);
    }
    public static String getSpace(int n)
        {
            String s="";
            for(int j=0;j<n;j++)
            {
                s=s+" ";
            }
            return s;

        }
        
}