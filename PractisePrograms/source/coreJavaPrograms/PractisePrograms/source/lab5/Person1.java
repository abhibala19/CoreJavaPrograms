package coreJavaPrograms.PractisePrograms.source.lab5;
import CoreJavaPrograms.PractisePrograms.source.lab3.PrimeWithRange;
import CoreJavaPrograms.PractisePrograms.source.lab4.Car;
import CoreJavaPrograms.PractisePrograms.source.lab4.Dog;

public class Person1 {
	private String name;

	public void setName(String s) {
		if (s == null || s.trim().equals("")) {
			System.out.println("give valid name");
		} else
			name = s;
	}
	public String getName() {
		return name;
	}

	public void commute(Car c, String d) {
		c.start();
		c.drive();
		c.stop();
		System.out.println("the desination place " + d + " is reached");
	}
	public void  sing(Song s) {
		s.play();
			}
	public void walk(Dog d) {
		d.bark();
	}
	public void eat(Food f) {
		System.out.println("i am "+name+" having "+f.getFoodName());
	}
	public void generataPrime(int n)
	{
		PrimeWithRange.findPrimeWithRange(n);
	}  

}