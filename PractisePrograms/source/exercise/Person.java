package exercise;

public class Person implements Cloneable{
public static boolean checkIsCloneable(Object o) {
if(o instanceof Cloneable)
{
	return true;
}
else 
	return false;
}
public void buyTickets()
{
	System.out.println("i buying ticket to travel n metro");
}
public void checkGoingInMetro(Metro m)
{
	m.standInQueue(this);
}

}
