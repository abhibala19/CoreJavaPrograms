package lab9;

public class Woman {
String name;
Man husband;
public Woman(String n)
{
	name=n;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void marry(Man m)
{
	if(m!=null && m.wife==null && husband==null)
		husband=m;
	else
		throw new IllegalArgumentException("hey you already married");
}
public void divorse(Man m)
{
	m.wife=null;
	husband=null;
}
public void work()
{
	System.out.println(" i am "+name+"working a whole day");
}
}
