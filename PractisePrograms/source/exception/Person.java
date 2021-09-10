package exception;

public class Person {
	private String name;
	private int age;

	public Person(String s, int age) {
		if (s == null || s.trim().equals("")) {
			throw new IllegalArgumentException("give proper name to the person");
		} else
			name = s;
		if (age < 0 || age > 100) {
			throw new IllegalArgumentException("person yet tobe born or dead");
		} else
			this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("give proper name to the person");
		} else
			this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 100) {
			throw new IllegalArgumentException("person yet tobe born or dead");
		} else

			this.age = age;
	}

public void dance(String s)throws DanceFailureException
{
	if(age>50)
		{
		System.out.println(" i am "+name+" dancing salsa "+s);
		}
else
	throw new DanceFailureException("for salsa dancing age must be  below 50");
		}
}

