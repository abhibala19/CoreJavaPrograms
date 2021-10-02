package exercise;

public class DogPet extends Pet {
public DogPet(String name,int age) {
	// TODO Auto-generated constructor stub
	super(name,age);
}
public void eat()
{
System.out.println(getName()+" eating dosa"+getAge());
}
	
public static void main(String[] args) {
	Pet p=new DogPet("puppy",67);
	p.eat();
}
}
