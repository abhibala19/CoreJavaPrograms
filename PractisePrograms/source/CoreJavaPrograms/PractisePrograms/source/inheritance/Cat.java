package CoreJavaPrograms.PractisePrograms.source.inheritance;

public class Cat extends Animal {
    public void shout()
    {
        System.out.println("i am cat "+getName()+" meow meow");
    }
    public Cat(String s)
    {
        super(s);
        System.out.println("in cat's const");

    }

    
}
