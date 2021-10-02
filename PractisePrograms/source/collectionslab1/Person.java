package collectionslab1;

public class Person {
	private String name;
	private int height;
public Person(String name,int height)
{if(name==null || name.trim().equals(""))
{
	throw new IllegalArgumentException("give valid name to the person");
}
else
	this.name=name;
if(height>0)
	this.height=height;
else
	throw new IllegalArgumentException("give proper age");
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	if(name==null || name.trim().equals(""))
	{
		throw new IllegalArgumentException("give valid name to the person");
	}
	else
		this.name=name;

}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	if(height>0)
		this.height=height;
	else
		throw new IllegalArgumentException("give proper age");

}
public boolean equals(Object o)
{
	System.out.println("in equals method");
	if(o instanceof Person)
	{
		Person p=(Person)o;
		if(p.name.equals(this.name)&&(p.height==this.height)) {
			return true;
		}
	}
	return false;

}
public String toString(Object o)
{
	return "person"+name+","+height+".";
}public Person() {
	// TODO Auto-generated constructor stub
}
}
