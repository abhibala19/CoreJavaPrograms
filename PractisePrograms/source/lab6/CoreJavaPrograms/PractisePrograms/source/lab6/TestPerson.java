package CoreJavaPrograms.PractisePrograms.source.lab6;

public class  TestPerson {
	public static void main(String[] args) {
		System.out.println(Person.getCount());
		Person p2 = new Person("abhi", 10);
		Person p3 = new Person("abhi");
		Person p1 = new Person("aaa", 12);
		System.out.println(Person.getCount());
		System.out.println(p2.getName());
		System.out.println(p2.getName());
		System.out.println(p1.getName());
		p1.setName("asdfg");
		p1.setAge(19);
		for (int i = 0; i < 100; i++) {
			Person p = new Person("asdf", 67);

		}

		System.out.println(Person.getCount());

	}
}