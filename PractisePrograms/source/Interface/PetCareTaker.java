package Interface;

public class PetCareTaker {
	String name;
	public PetCareTaker(String s)
	{
		name=s;
	}
	public void takeCare(Pet p)
	{
		System.out.println("i am care taker "+name);
		p.play();
	}

}
