package lab9;

public class Person {
	private String name;

	public void use(Device d) {
		System.out.println("i am " + name);
		d.doSomething();
		if (d instanceof Phone) {
			Phone p = (Phone) d;
			p.call("78995959494");
		}
	}

	public Person(String name) {
		// TODO Auto-generated constructor stub

		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("give proper name to the person");
		} else
			this.name = name;

	}

	public void setName(String name) {
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("give proper name to the person");
		} else
			this.name = name;

	}
	public String getName()
	{
		return name;
	}
}
