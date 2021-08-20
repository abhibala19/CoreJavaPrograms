package CoreJavaPrograms.PractisePrograms.source.lab6;
public class TestJoke
{
    public static void main(String[] args)
    {
        System.out.println(Joke.getCount());
        Joke j1=new Joke("ba baa blaclsheep");
        System.out.println(Joke.getCount());
        Joke j2=new Joke("bbbbbbbbeeeeeep");
        System.out.println(Joke.getCount());
        Joke j3=new Joke("babaaaaaaaaaa");
        System.out.println(Joke.getCount());
        j1.print();
        
    }
}