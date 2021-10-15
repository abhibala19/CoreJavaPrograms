package Collectionlab3;

public class LinkedListStack implements Stack {
Node top;
long size;
public void push(int d)
{
	Node n=new Node(d);
	if(top==null)
		top=n;
	else {
		n.next=top;
	top=n;
	}
	size++;
}
public int pop()
{
	if(size>0) {
	Node temp=top;
	top=temp.next;
	temp.next=null;
	return temp.data;
	}else
		throw new IllegalArgumentException("first add element");
	
}
public int peek()
{
	return top.data;
}
public void printElements()
{
	Node temp=top;
	while(temp!=null)
	{
		System.out.print(temp.data);
		temp=temp.next;
	}
	System.out.println();
}
}
