package coreJavaPrograms.PractisePrograms.source.lab7;

public class Person {
	private static int count;
	private String name;
	private int age;

	public void setName(String r) {
		if (validateName(r) == true) {
			name = r;
		} else {
			System.out.println("give valid name");
		}
	}

	public boolean validateName(String s) {
		if (s != null && s.length() < 30 && (s.trim() != "")) {
			return true;
		}
		return false;
	}

	public boolean validateAge(int n) {
		if (n > 0 && n < 100) {
			return true;
		}
		return false;
	}

	public void setAge(int f) {
		if (validateAge(f) == true) {
			age = f;
		} else {
			System.out.println("person is yet to born or dead");
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person() {
		Person.count++;
		System.out.println("in Person no arg constructor");
	}

	public Person(String d, int n) {
		Person.count++;
		if (validateName(d) == true) {
			name = d;
		} else {
			System.out.println("give valid name");
		}
		if (validateAge(n) == true) {
			age = n;
		} else {
			System.out.println("person is yet to born or dead");
		}
	}

	public Person(String g) {
		count++;
		name = g;
		System.out.println(name);
	}

	public static int getCount() {
		return Person.count;
	}

}