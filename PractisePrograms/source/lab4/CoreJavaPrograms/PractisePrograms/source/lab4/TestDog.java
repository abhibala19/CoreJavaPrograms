package CoreJavaPrograms.PractisePrograms.source.lab4;
public class TestDog
{
    public static void main(String[] args)
    {
        Dog d1=new Dog();
//        d1.name="puppy";
        // d1.size=9;
        d1.setSize(5);
       System.out.println (d1.getSize());
        d1.bark();

    }
}