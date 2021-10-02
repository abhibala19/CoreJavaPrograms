package collections;

public class Node {
private String data;
public Node next;
private long pos;
public Node(String data,long pos) {
	// TODO Auto-generated constructor stub
	if(data==null || data.trim().equals(""))
	{
		throw new IllegalArgumentException("data is null");
		
	}else
		this.data=data;
	if(pos>=0)
		this.pos=pos;
	else
		throw new IllegalArgumentException("pos is not in the list");
}
public String getData() {
	return data;
}
public void setData(String data) {
	if(data==null || data.trim().equals(""))
	{
		throw new IllegalArgumentException("data is null");
		
	}else
	
	this.data = data;
}
public long getPos() {
	return pos;
}
public void setPos(long pos) {
	if(pos>=0)
		this.pos=pos;
	else
		throw new IllegalArgumentException("pos is not in the list");

}
}
