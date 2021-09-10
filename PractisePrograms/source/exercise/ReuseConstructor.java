package exercise;

public class ReuseConstructor {
	String name;
	int age;

	public ReuseConstructor(String name, int age) {
		this(name);
		System.out.println("in double arg constr");
		if (age > 0 && age < 100)
			this.age = age;
	}

	public ReuseConstructor(String name) {

		System.out.println("in single argm contsr ");
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("give a valid name");
		} else

			this.name = name;
	}

	public ReuseConstructor() {
		System.out.println("in no arg contr");
	}
}
