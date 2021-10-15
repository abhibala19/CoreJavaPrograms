package Collectionlab3;

import java.util.Date;

public class Student implements Comparable<Student>{
	private String name;
	private String emailId;
	private Date dob;
	private String id;

	public void setName(String name) {
		if (name == null || name.trim().contentEquals(""))
			throw new IllegalArgumentException("give valid name");
		else
			this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		if (id == null || name.trim().contentEquals(""))
			throw new IllegalArgumentException("give valid id");
		else
			this.id = id;

	}

	public String getId() {
		return id;
	}

	public void setEmailId(String emailId) {
		if (emailId == null || name.trim().contentEquals(""))
			throw new IllegalArgumentException("give valid emailid");
		else
			this.emailId = emailId;

	}

	public String getEmailId() {
		return emailId;
	}

	public Student(String name, String id, String emailId, Date dob) {
		// TODO Auto-generated constructor stub
		if (name == null || name.trim().contentEquals(""))
			throw new IllegalArgumentException("give valid name");
		else
			this.name = name;
		this.dob = dob;

		if (id == null || name.trim().contentEquals(""))
			throw new IllegalArgumentException("give valid id");
		else
			this.id = id;

		if (emailId == null || name.trim().contentEquals(""))
			throw new IllegalArgumentException("give valid emailid");
		else
			this.emailId = emailId;

	}

	public boolean equals(Object o1) {
		if (o1 instanceof Student) {
			Student s = (Student) o1;
			if ((this.name.equals(s.name)) && (this.emailId.equals(s.id)) && (this.emailId.equals(s.emailId))
					&& (this.dob.toString().equals(s.dob.toString()))) {
				return true;
			} else
				return false;
		}

		else
			return false;

	}
	public int hashCode()
	{
		return (name+id+emailId+dob).hashCode();
	}
	public String toString()
	{
		return "Student: name = "+name+" id "+id+" emailid "+emailId+" dob "+dob;
	}
	public int compareTo(Student o)
	{
		 return this.dob.compareTo(o.dob);
	
	}
}
