package collections;

import java.util.ArrayList;

public class SinglyLinkedList implements LinkedList {
	public Node head;
	public Node last;
	private long size;

	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
	}

//public Node getHead() {
//		return head;
//	}
//
//	public void setHead(Node head) {
//		this.head = head;
//	}
//
//	public Node getLast() {
//		return last;
//	}
//
//	public void setLast(Node last) {
//		this.last = last;
//	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	@Override
	public void add(String data) {
		// TODO Auto-generated method stub
		Node n = new Node(data, size);
		if (head == null && last == null) {
			head = last = n;
		} else {
			last.next = n;
			last = n;

		}
		size++;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head = null;
		last = null;
		size = 0;

	}

	@Override
	public boolean contains(String data) {
		// TODO Auto-generated method stub
		Node temp = head;
		while (temp != null) {
			if (temp.getData().equals(data))
				return true;
			else
				temp = temp.next;
		}
		return false;
	}

	@Override
	public void insert(String data, long pos) {
// TODO Auto-generated method stub
		Node n = new Node(data, size);
		if (head == null || pos >= size) {
			System.out.println("list is empty cannot insert");
		} else {
			if (pos == 0) {
				head.next = n.next;
				head = n;
			} else {
				Node temp = head;
				for (int i = 0; i < pos - 1; i++)
					temp = temp.next;
				n.next = temp.next;
				temp.next = n;
				reposition();
			}
		}
	}

	private void reposition() {
		if (head == null)
			System.out.println("no reposition");
		else {
			Node temp = head;
			int i = 0;
			while (temp != null) {
				temp.setPos(i++);
				temp = temp.next;
			}

		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size == 0);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		if (head == null)
			System.out.println("no elemetns to print");
		Node temp = head;
		while (temp != null) {
			System.out.println("at position " + temp.getPos() + " " + temp.getData());
			temp = temp.next;
		}
	}@Override
	public String remove(int pos) {
	
		// TODO Auto-generated method stub
		if(pos==0)
		{
			String d=head.getData();
			head=head.next;
			return d;
		}else
		{
			Node temp=head;
		for(int i=0;i<pos;i++)
		{
			temp=temp.next;
		}
		Node remove=temp.next;
		temp.next=remove.next;
		remove.next=null;
		reposition();
		return remove.getData();
		}
		
	}@Override
	public long size() {
		// TODO Auto-generated method stub
		return size;
	}
	public String remove(String data)
	{
		if(size==0)
			throw new IllegalArgumentException("no element is there to remove");
		if(size==1 && head.getData()==data)
		{
			head=last=null;
		}
		Node temp=head;
		Node prev=null;
		while(temp.getData()!=data && temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp.next!=null && temp.getData()==data)
		{
			prev.next=temp.next;
		temp.next=null;
		}
		size--;
		return data;
	}
	
	
	
}
