package CoreJavaPrograms.PractisePrograms.source.lab4;

public class Pen {
	private int inkQty;
	private String colour;

	public int getInkQty() {

		return inkQty;
	}

	public void setInkQty(int inkQty) {
		if (inkQty > 0)
			this.inkQty = inkQty;
		else
			System.out.println("give valid quantity");
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		if (colour == null && colour.trim().equals(""))
			System.out.println("give valid colur");
		else
			this.colour = colour;
	}

	public void write(String data) {
		if (inkQty > 0) {
			System.out.println("i am " + colour + "pen writting" + data);
		} else
			System.out.println("fill the ink first");
	}

	public void refill(int quantity) {
		inkQty = inkQty + quantity;
		System.out.println("now the inkquantity is " + inkQty);
	}

}