package CoreJavaPrograms.PractisePrograms.source.lab4;
public class TestPen
{
    public static void main(String[] args)
    {
        Pen p1=new Pen();
        Pen p2=new Pen();
        p1.setColour("blue");
        p1.setInkQty(17);
        p2.setColour("black");
        p2.setInkQty(34);
        p1.write("see how beautifully I am writting");
        p2.write("see how beautifully I am writting");
        p1.refill(50);
        p2.refill(20);

    }
}