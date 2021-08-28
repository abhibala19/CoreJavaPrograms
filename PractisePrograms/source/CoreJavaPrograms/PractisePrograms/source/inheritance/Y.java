package CoreJavaPrograms.PractisePrograms.source.inheritance;
public class Y extends X 
{
    int a=10;
    static int b=20;
    static{
       System.out.println("in static initializer 1  in subclass"+b);
       b=30;
   } static{
       System.out.println("in static initializer 2 in subclass y  "+b);
       b=50;
   }
    {
       System.out.println("in instance initializer 1 in subclass "+a);
       a=20;
   }   
   {
       System.out.println("in instance initializer 2  in subclass "+a);
       a=30;
   }   
   public Y()
   {
       System.out.println("in no arg contsr instanse variable sub class "+a);
       System.out.println("in no arg contsr Static variable subclass "+b);
       a=40;
       b=60;
   }
   
   }
   