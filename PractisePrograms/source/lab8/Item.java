package lab8;

public class Item {
private String name;
private double price;
public String getName() {
	return name;
}
public void setName(String name) {
	if(name==null || name.trim().equals(""))
	{
		throw new IllegalArgumentException("give valid name");
	}
	else
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	if(price>0)
	{
		throw new IllegalArgumentException("first give valid amount");
	}
	else
	this.price = price;
}
public Item()
{
	System.out.println("in no arg contsr");
}
public Item(String n,Double p)
{
	System.out.println("in item prarmeter contsr");
	if(n==null || n.trim().equals(""))
	{
		System.out.println("give valid item name");
	}
	else
		name=n;
	if(p>0)
	{
		price=p;
	}
}

}
