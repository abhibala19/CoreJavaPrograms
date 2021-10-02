package collectionslab1;

public class Address {

	private String city;
	private String street;
	private String pin;
	private String zip;

	public Address(String city, String street, String pin, String zip) {
		// TODO Auto-generated constructor stub
		if (city == null || city.trim().equals("")) {
			throw new IllegalArgumentException("give existing city");
		}
		this.city = city;
		if (street == null || street.trim().equals("")) {
			throw new IllegalArgumentException("give existing street");
		} else
			this.street = street;
		if (pin == null || pin.trim().equals("")) {
			throw new IllegalArgumentException("give vali pincode");
		} else
			this.pin = pin;
		if (zip == null || zip.trim().equals("")) {
			throw new IllegalArgumentException("give proper zipcode");
		} else
			this.zip = zip;

	}

	public String getCity() {
		return city;
	}

	public boolean equals(Object o) {
		System.out.println("i equals method of address");
		if (o instanceof Address) {
			Address a = (Address) o;
			if (this.getCity() == a.getCity() && this.getZip() == a.getZip() && this.getStreet() == a.getStreet()
					&& this.getPin() == a.getPin()) {
				return true;
			}
		}
		return false;
	}

	public void setCity(String city) {
		if (city == null || city.trim().equals("")) {
			throw new IllegalArgumentException("give existing city");
		}
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		if (street == null || street.trim().equals("")) {
			throw new IllegalArgumentException("give existing street");
		} else
			this.street = street;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		if (pin == null || pin.trim().equals("")) {
			throw new IllegalArgumentException("give vali pincode");
		} else
			this.pin = pin;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		if (zip == null || zip.trim().equals("")) {
			throw new IllegalArgumentException("give proper zipcode");
		} else
			this.zip = zip;
	}

}
