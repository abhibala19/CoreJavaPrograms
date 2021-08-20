package CoreJavaPrograms.PractisePrograms.source.lab4;
public class Dog
{
     private int size;
     private String name;
     public void seName(String name) {
    	 if(name==null || name.trim().contentEquals("")) {
    		 System.out.println("give a valid name");
    	 }
    	 else
    		 this.name=name;
     }
     public String getName() {
    	 return name;
     }
    public void bark()
    {
        if(size<0)
        {
            System.out.println("give the valid size");
        }
        if(size>10)
        {
            System.out.println("my dog "+name+"meows");
        }
        else
        {
            for(int i=0;(i<10)&&(i>=0);i++)
            {
                System.out.println("my dog "+name+"bow bow");
            }

        }

    }
    public void setSize(int n)
    {
        if(n<0)
        {
            System.out.println("give valid Size");
        }
        else
        {
            size=n;
        }
    }
    public int getSize()
    {
        return size;
    }
}