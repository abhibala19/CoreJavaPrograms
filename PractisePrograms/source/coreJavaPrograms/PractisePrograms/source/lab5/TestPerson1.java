package coreJavaPrograms.PractisePrograms.source.lab5;
import CoreJavaPrograms.PractisePrograms.source.lab4.Car;
import CoreJavaPrograms.PractisePrograms.source.lab4.Dog;

public class TestPerson1 {
	public static void main(String[] args) {
		Car c = new Car();
		c.setCarName("maruti");
		c.setFuelQty(5);
		Person1 person1 =new Person1();
		person1.setName("abhi");
		person1.commute(c, "chennai");
		Song song=new Song("myna","mynave mynave mynave");
		song.setName("poove unakaga");
		song.setLyrics("aioooo aiooo aiooo aioooa aioo");
		person1.sing(song);
		Dog dog=new Dog();
		dog.seName("puppy");
		dog.setSize(7);
		person1.walk(dog);
		Food food=new Food();
		food.setFoodName("dosa");
		food.setPrice(54.0);
		person1.eat(food);
		person1.generataPrime(100);
	}
}