package coreJavaPrograms.PractisePrograms.source.lab7;
public class Joke
{
    private static int count=0;
    private String text;
    public boolean validateText(String s)
    {
        if(s==null || s.trim().equals(""))
        {
            return false;
        }
        return true;
    }
    public static int getCount()
    {
        return count;
    }
    public Joke(String t)
    {
        count++;
        boolean b=validateText(t);
        if(b==true)
        {
            text=t;
        }
        else
        System.out.println("give valid text");
    }
    public void setText(String d)
    {  
        boolean c=validateText(d);
        if(c==true)
        {
            text=d;
        }
        else
        System.out.println("give valid text");
    }
    public String getText()
    {
        return text;
    }
    public void print()
    {
        System.out.println(text);
    }
}