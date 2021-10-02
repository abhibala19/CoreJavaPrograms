package lab8;

public class Bag {
	int count = 0;
	Item[] item;
	private String name;
	private int noOfItem;

	public Bag(String n, int p) {
		System.out.println("in bag paarameter constr");
		if (n == null || n.trim().equals("")) {
			System.out.println("give valid name");
		} else
			name = n;
		if (p > 0) {
			item = new Item[p];
			noOfItem = p;
		}

	}

	public void addItem(Item i) {
		if (i != null && count < noOfItem)
			item[count++] = i;
		else
			System.out.println("you can hold only 4 item");
	}

	public boolean searchItem(Item k) {
		if (k != null) {
			for (int i = 0; i < count; i++) {
				if (k == item[i])
					return true;
			}
		} else
			System.out.println("your item not in the bag");
		return false;

	}

	public double getItemPrice(String n) {
		double price = 0;
		for (int i = 0; i < count; i++) {
			if (n == item[i].getName()) {
				price = item[i].getPrice();
			}
		}
		return price;
	}

	public double getTotal() {
		double total = 0;
		for (int i = 0; i < count; i++) {
			total = total + item[i].getPrice();
		}
		return total;
	}
}
