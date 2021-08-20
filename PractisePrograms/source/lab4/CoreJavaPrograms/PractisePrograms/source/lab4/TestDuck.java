package CoreJavaPrograms.PractisePrograms.source.lab4;
public class TestDuck
{
    public static void main(String[] args)
    {
        Duck d1=new Duck();
        Duck d2=new Duck();
        d1.setTailSize(10);
        d2.setTailSize(20);
        System.out.println("After setting tail size 10, 20");
        d1.swim(); //10
        d2.swim(); //20
        d1.setTailSize(d2.getTailSize());
        System.out.println("After setting tail size d1=d2");
        d1.swim(); // 20
        d2.swim(); // 20
        d1.setTailSize(30);
        System.out.println("After setting tail size d1 is 30");
        d1.swim(); // 30
        d2.swim(); // 20
        System.out.println("After setting d1=d2");
        d1=d2;
        System.out.println(d1.getTailSize()); // 20
        System.out.println(d2.getTailSize()); // 20
        d1=null;
        d2=null;
        System.out.println("After setting d1=d2=null");
        // CAN ANY DUCK OBJECT BE ACCESSED? No
        d1=new Duck();
        // How many objects are reachable? 1

    }
}