package CoreJavaPrograms.PractisePrograms.source.inheritance;
public class TestDevice
{
    public static void main(String[] args) {
        
        Device d1=new Tv("LG");
        // d1.setName("onida");
        // d1.doSomething();
        Device s=new MicroWave("tata");
        Device p=new Printer("hd");
        Electrician e=new Electrician();
        e.testDevice(d1);
        e.testDevice(s);
        e.testDevice(p);
        // System.out.println("in tv subclass before testing");
        // // d1.name="electronic device";
        // e.testDevice(d1);
        // Device m=new MicroWave();

        // System.out.println("in microwave subclass before testing");
        // e.testDevice(m);
        // Device p=new Printer();

        // System.out.println("in printer subclass before testing");
        //  e.testDevice(p);

        // // Device d2=new Device("electric ");
        // // d1.doSomething();
        // // Tv v=(Tv)d1;
        // // v.switchChannel();
        // // d2.doSomething();
        // // d1=new Printer();
        // // d1.doSomething();
        // // d1=new MicroWave();
        // // d1.doSomething();
        // // System.out.println(d1 instanceof Tv);
        // // System.out.println(d1 instanceof Device);
        // // System.out.println(d1 instanceof MicroWave);
        // // System.out.println(d1 instanceof Printer);




    }
}