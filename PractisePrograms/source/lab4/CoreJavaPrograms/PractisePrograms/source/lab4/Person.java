package CoreJavaPrograms.PractisePrograms.source.lab4;

public class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 120) {
			System.out.println("give valid age");
		} else
			this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null && name.trim().equals("")) {
			System.out.println("give a valid name");
		} else
			this.name = name;
	}


	public void eat() {
		if (age < 40) {
			System.out.println(" i am  " + name + " can eat less");
		} else {
			System.out.println("i am " + name + " can eat more");
		}
	}

	public void sleep() {
		if (age < 40) {
			System.out.println(" i will sleep more");

		} else {
			System.out.println(" i will sleep less");
		}
	}
}