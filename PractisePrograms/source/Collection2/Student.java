package Collection2;

public class Student implements Comparable<Student> {

	private String name;
	private String id;
	private int age;

	public Student(String name, String id, int age) {
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException("give valid name");

		} else
			this.name = name;
		if (age > 0)
			this.age = age;
		else
			throw new IllegalArgumentException("enter proper age");
		if (id == null || id.equals("")) {
			throw new IllegalArgumentException("give valid id");

		} else
			this.id = id;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException("give valid name");

		} else
			this.name = name;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id == null || id.equals("")) {
			throw new IllegalArgumentException("give valid id");

		} else
			this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else
			throw new IllegalArgumentException("enter proper age");

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (this.name.equals(s.name) && this.id.equals(s.id) && this.age == s.age) {
				return true;

			} else
				return false;

		} else
			return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+id+age).hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student:"+name+","+id+","+age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return this.age-o.age;
	}
}
