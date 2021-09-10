package lab9;

public class Item {
	private String name;
	private int serialNum;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("give proper name to the item");
		} else
			this.name = name;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum() {

		this.serialNum = (int) (Math.random() * 1000);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			throw new IllegalArgumentException("give existing money");
	}

	public Item(String name, double price) {
		this(name);
		System.out.println("in double parameterizzed constr");

		if (price > 0)
			this.price = price;
		else
			throw new IllegalArgumentException("give existing money");
		this.serialNum = (int) (Math.random() * 1000);
		// TODO Auto-generated constructor stub
	}

	public Item(String name) {
		System.out.println("in single parameterizzed constr");

		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("give proper name to the item");
		} else
			this.name = name;

		// TODO Auto-generated constructor stub
	}
	public Item() {
		System.out.println("in no arg comstr");
	// TODO Auto-generated constructor stub
	}

}