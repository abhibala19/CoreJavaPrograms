package CoreJavaPrograms.PractisePrograms.source.lab4;
public class TestCar
{
    public static void main(String[] args)
    {
        Car c=new Car();
        c.setCarName("maruti");
        c.setFuelQty(2);
        System.out.println(c.getFuelQty());
        c.start();
        c.drive();
        c.reverse();
       c.stop();
        System.out.println(c.getFuelQty());

    }
}