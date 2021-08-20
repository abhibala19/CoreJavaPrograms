package CoreJavaPrograms.PractisePrograms.source.lab6;
public class Song
{
    private String name;
    private String lyrics;
    public boolean validateName(String s)
    {
        if((s==null) || (s.trim().equals("")))
        {
            return false;
        }
        else
        return true;
    }
    public void setName(String a)
    {
        boolean b=validateName(a);
        if(b==true)
        {
            name=a;
        }
        else
        {
            System.out.println("give proper name");
        }
    }
    public String getName()
    {
        return name;
    }
    public void setLyrics(String c)
    {
        boolean v=validateName(c);
        if(v==true)
        {
            lyrics=c;
        }
        else
        System.out.println("give proper lyrics");
    }
    public String getLyrics()
    {
        return lyrics;
    }
    public void play()
    {
        System.out.println("song name "+name+" playing "+lyrics);
    }
    public Song(String a1,String a2)
    {
        System.out.println("in double  parameterized constructor");
        boolean c1=validateName(a1);
        boolean c2=validateName(a2);
        if(c1==true)
        {
            name=a1;
        }
        else{
            System.out.println("give valid name");
        }
        if(c2==true)
        {
            lyrics=a2;
        }
        else
        {

            System.out.println("give proper lyrics");
        }
    }
    public Song(String d)
    {
        System.out.println("in single parameterized constructor");
        boolean f=validateName(d);
        if(f==true)
        {
            name=d;
        }
        else
        System.out.println("give valid name");
    }

}