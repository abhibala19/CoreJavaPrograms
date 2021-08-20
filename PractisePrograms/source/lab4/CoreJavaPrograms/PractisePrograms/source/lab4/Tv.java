package CoreJavaPrograms.PractisePrograms.source.lab4;
public class Tv
{
    private String name;
    private int channel;
    private boolean status=false;
    private int volume;

    public void setChannel(int n)
    {
        if(status==true)
        {
            if((n>0)&&(n<10))
            {
                channel=n;
            } 
            else
            {
                System.out.println("give a valid channel");
            }
        } else {
            System.out.println("please switch on the tv first");
        }
    }

    public int getChannel()
    {
        if(status==true)
        {
            return channel;
        } else {
            System.out.println("please switch on the tv first");
            return 0;
        }
    }
    public void setVolume(int m)
    {
        if(status==true) 
        {
            if((m>0)&&(m<100))
            {
                volume=m;
            }
            else
            {
                System.out.println("invalid volume");
            }
        } else {
            System.out.println("please switch on the tv first");
        }
    }
    public int getVolume()
    {
        if(status==true) 
        {
            return volume;
        } else {
            System.out.println("please switch on the tv first");
            return 0;
        }
    }
    public void setName(String s)
    {
        if(status==true)
        {
            name=s;
        } else {
            System.out.println("please switch on the tv first");
        }
    }
    public String getName()
    {
        if(status==true)
        {
            return name;
        } else {
            System.out.println("please switch on the tv first");
            return null;
        }
    }
    public void increasevolume()
    {
        if(status==true)
        {
            setVolume(getVolume()+1);
        } else {
            System.out.println("please switch on the tv first");
        }
    }
    public void decreaseVolume()
    {
        if(status==true)
        {
            setVolume(getVolume()-1);
        } else {
            System.out.println("please switch on the tv first");
        }
    }
    public void increaseChannel()
    {
        if(status==true)
        {   
           setChannel(getChannel()+1);
        } else {
            System.out.println("please switch on the tv first");
        }
    
    }
    public void decreaseChannel()
    {
        if(status==true)
        { 
            setChannel(getChannel()-1);
        } else {
            System.out.println("please switch on the tv first");
        }
    }
    public void power()
    {
        if(status==false)
        {
            System.out.println(" your "+name+" tv is switched on");
            status=true;
        }
        else
        {
            System.out.println(" your "+name+" tv is switched off");
            status=false;
        }
    }
    public void display()
    {
  
        if(status==true)
        {
            System.out.println("you are watching channel no"+channel+"and the volume is"+volume);

        }
        else
        {
            System.out.println("switch on the tv first");
        }
    }




}