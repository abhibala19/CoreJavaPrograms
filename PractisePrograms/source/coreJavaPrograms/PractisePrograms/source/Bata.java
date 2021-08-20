package coreJavaPrograms.PractisePrograms.source;
public class Bata
{
    public static void main(String[] args)
    {
        String b="bata";
        int a=b.length()*2;
        char[] ca=new char[a];
         ca=b.toCharArray();
        ca[ca.length/2]=' ';
        b= new String(ca);
        System.out.println(b);
    }
}