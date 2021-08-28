package CoreJavaPrograms.PractisePrograms.source.inheritance;
public class X {
 int i=10;
 static int x=20;
 static{
    System.out.println("in static initializer 1 "+x);
    x=30;
} static{
    System.out.println("in static initializer 2 "+x);
    x=50;
}
 {
    System.out.println("in instance initializer 1 "+i);
    i=20;
}   
{
    System.out.println("in instance initializer 2 "+i);
    i=30;
}   
public X()
{
    System.out.println("in no arg contsr instanse variable "+i);
    System.out.println("in no arg contsr Static variable "+x);
    i=40;
    x=60;
}

}
