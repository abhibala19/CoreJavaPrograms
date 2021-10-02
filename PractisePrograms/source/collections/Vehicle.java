package collections;

public class Vehicle {
private String name;
private int capacity;
@Override
	public int hashCode() {
		// TODO Auto-generated method stub
	System.out.println("in hashcode method ");
		return (name+capacity).hashCode();
	}
public Vehicle(String name,int capacity) {
	if(name==null || name.trim().equals(""))
	{
		throw new IllegalArgumentException("give valid name");
	}else
		this.name=name;
	if(capacity>0)
	{
		this.capacity=capacity;
	}
	else
		throw new IllegalArgumentException("give valid capacity");
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	if(name==null || name.trim().equals(""))
	{
		throw new IllegalArgumentException("give valid name");
	}else
	this.name = name;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	if(capacity>0)
	{
		this.capacity=capacity;
	}
	else
		throw new IllegalArgumentException("give valid capacity");
}public boolean equals(Object o)
{
	if(o instanceof Vehicle)
	{
		Vehicle v=(Vehicle)o;
		System.out.println("vehicle equals testing "+"vehicle name = "+this.name +" "+v.name +" capacity "+this.capacity +" "+v.capacity);

		if(this.name.equals(v.name)&& this.capacity==v.capacity )
		{
			return true;
		}
	}
	return false;
}
}
