package exercise;

public class Pet {
private String name;
private int age;
public Pet(String name,int age) {
	// TODO Auto-generated constructor stub
	this.name=name;
	this.age=age;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void eat()
{
	System.out.println("pet eating");
}
}
