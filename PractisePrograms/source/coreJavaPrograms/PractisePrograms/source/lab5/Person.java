package coreJavaPrograms.PractisePrograms.source.lab5;
public class Person
{
    private String name;
    private int age;
    private String[] petNames=new String[20];
    int count=0;
    public void setName(String s)
    {
        if(s!=null || s.length()!=0 || s.trim() !="")
        {
            name=s;
        }
        else
        {
            System.out.println("give valid name");
        }
    }
    public void addPetNames(String c)
    {
        if(count<petNames.length)
        {
            petNames[count++]=c;
        }
        else
        {
            System.out.println("only 20 petnames are allowed");
        }
    }
    public boolean searchPetNames(String f)
    {
        for(String v:petNames)
        {
            if(v.equals(f))
            {
                return true;
            }
        }
            return false;
    }

    public void setAge(int n)
    {
        if(n>0 && n<100)
        {
            age=n;
        }
        else
        {
            System.out.println("give between 1 and 100");
        }
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String[] getPetNames()
    {
        return petNames;
    }
    public void dance()
    {
        if(age<25)
        {
            System.out.println(" i am "+name+ " chacha cha cha");
        }
        if(age>25)
        {
            System.out.println("i am "+name+" dancing waltz");
        }
    }
    public void sing()
    {
        StringBuilder song=new StringBuilder("");
        for(int i=0;i<petNames.length;i++)
        {
            int d=(int)(Math.random()*20);
            song.append(petNames[d]);
        }
        String s=song.toString();
        System.out.println(s);
    }
}