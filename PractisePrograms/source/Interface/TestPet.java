package Interface;

public class TestPet {
public static void main(String[] args) {
	System.out.println("pet.x = "+Pet.X);
	PetCareTaker pt=new PetCareTaker("ramu");
	System.out.println("pet.NAME = "+Pet.NAME);

	Pet p=new Snake("nagini");
	p.play();
	Pet p2=new Doggie("jimmie");
	p2.play();
	pt.takeCare(p2);
	pt.takeCare(p);
	
}
}
