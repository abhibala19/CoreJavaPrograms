package collections;

public class Address {
private String homeNum;
private String city;
public Address() {
	// TODO Auto-generated constructor stub
}
public Address(String homeNum, String city) {
	super();
	if(this.homeNum==null || this.homeNum.trim().equals(""))
	{
		throw new IllegalArgumentException("give proper homenum");
	}else
	this.homeNum = homeNum;
	
	this.city = city;
}
public String getHomeNum() {
	return homeNum;
}
public void setHomeNum(String homeNum) {
	this.homeNum = homeNum;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}
