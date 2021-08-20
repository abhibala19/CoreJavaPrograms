package CoreJavaPrograms.PractisePrograms.source.lab2;

public class Test

{
    public static int  process(int a)
    {
         a=15;
        System.out.println("process starts"+a);
        if(a%2==0)
        {
        System.out.println("the number is even"+a);
        return a;
        }
        else { 
            return 0;
        }
    }
    
    public static void main(String[] a)
    {
        int x=10;
      System.out.println("main starts" +x);
     int b= Test.process(x);
      System.out.println("main ends"+ x);
      System.out.println("return value" + b);
       }
   
   
       public static void a(String[] args)
       {
        System.out.println("A is method");     }
   }
