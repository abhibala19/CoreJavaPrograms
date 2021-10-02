package collections;

public class Node1 {
Node1 next;
 private String data;
 public Node1() {
	// TODO Auto-generated constructor stub
}
public String getData() {
	return data;
}
public void setData(String data) {
	if(data==null || data.trim().equals(""))
		throw new IllegalArgumentException("give valid data");
	else
	this.data = data;
}
public Node1(String data)
{
	this.data=data;
}
}
