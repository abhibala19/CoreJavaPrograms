package CoreJavaPrograms.PractisePrograms.source.inheritance;

public class TestAnimal1 {
public static void main(String[] args) {
	Animal1 a=new Croc("ghuu");
	Animal1 b=new Hippo("sumo");
	Vet1 v=new Vet1("doctor");
	v.treatAnimal1(a);
	v.treatAnimal1(b);
}
}
