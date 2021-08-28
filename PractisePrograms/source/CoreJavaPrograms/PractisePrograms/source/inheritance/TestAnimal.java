package CoreJavaPrograms.PractisePrograms.source.inheritance;
public class TestAnimal {
    public static void main(String[] args) {
        Vet v=new Vet();
        Cat c=new Cat("lakshmi");
        Monkey m=new Monkey("meena");
        v.treatAnimal(c);
        v.treatAnimal(m);
    }
    
}
