package CoreJavaPrograms.PractisePrograms.source.inheritance;

public class Vet {
    public void treatAnimal(Animal a)
    {
        a.eat();
        a.sleep();
        if(a instanceof Cat)
        {
            Cat c=(Cat)a;
            c.shout();
        }
        if(a instanceof Monkey)
        {
            Monkey m=(Monkey)a;
            m.imitate();
        }
    }
    
}
