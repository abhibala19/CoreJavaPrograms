package collectionslab1;

public class Employee {
	private String name;
	private String dob;
	private Address officeAddress;
	private Address homeAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("give proper name");
		} else
			this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		if (dob == null || dob.trim().equals("")) {
			throw new IllegalArgumentException("give valid dob");

		} else
			this.dob = dob;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		if (officeAddress == null) {
			throw new IllegalArgumentException("first create office address");

		} else
			this.officeAddress = officeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		if (homeAddress == null) {
			throw new IllegalArgumentException("ei homeaddress is null");

		} else
			this.homeAddress = homeAddress;
	}

	public Employee(String name, String dob, Address homeAddress, Address officeAddress) {
		// TODO Auto-generated constructor stub
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("give proper name");
		} else
			this.name = name;

		if (dob == null || dob.trim().equals("")) {
			throw new IllegalArgumentException("give valid dob");

		} else
			this.dob = dob;

		if (officeAddress == null) {
			throw new IllegalArgumentException("first create office address");

		} else
			this.officeAddress = officeAddress;

		if (homeAddress == null) {
			throw new IllegalArgumentException("ei homeaddress is null");

		} else
			this.homeAddress = homeAddress;

	}

	public boolean equals(Object o) {
		System.out.println("in equals method of employee");
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			if (this.getName() == e.getName() && this.getDob() == e.getDob()
					&& this.getOfficeAddress() == e.getOfficeAddress() && this.getHomeAddress() == e.getHomeAddress())
			{
				return true;
			}
				

		}
		return false;
	}

}
