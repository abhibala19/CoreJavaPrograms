package CoreJavaPrograms.PractisePrograms.source.inheritance;
public class Device {
    private String name;
    public void setName(String s)
    {
        if(s==null || s.trim().equals(""))
        {
            System.out.println("give valid device  name");
        }
        else{
            name=s;
        }
    }
    public String getName()
    {
        return name;
    }
    public void doSomething()
    {
        System.out.println("A device name "+name+"doing something");
    }
    public Device()
    {
        System.out.println("in no arg constructor in device");
    }
    public Device(String s)
    {
        name=s;
        System.out.println(("in parameter constructor"));
    }

}