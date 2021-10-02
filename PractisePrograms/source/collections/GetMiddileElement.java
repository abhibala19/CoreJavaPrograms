package collections;

import Interface.Stack;

public class GetMiddileElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList ar=new SinglyLinkedList();
		ar.add("ask");
		ar.add("poo");
		ar.add("root");
		ar.add("erd");
		ar.add("sd");
		String n=findMiddleElement(ar);
		System.out.println(n);
		printElementsReverse(ar);
//		printRecursively(ar);

	}
	public static String findMiddleElement(SinglyLinkedList a)
	{
		if(a.head==null && a.last==null)
			System.out.println("list is empty");
		if(a.head.next==null)
			return a.head.getData();
		Node slow=a.head,fast=a.head;
		while(fast.next!=null && fast.next.next!=null )
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.getData();
		
	}
	public static boolean isCyclic(SinglyLinkedList a)
	{
		if(a.head==null && a.last==null)
			System.out.println("list is empty");
		if(a.head.next==null)
			return false;
		Node slow=a.head,fast=a.head;
		while(fast.next!=null && fast.next.next!=null && slow!=fast )
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		if(slow==fast)
			return true;
		return false;
		
	}
	public static void printElementsReverse(SinglyLinkedList a)
	{
		if(a.getSize()==0)
			throw new IllegalArgumentException("list is empty fill the list first");
		if(a.getSize()==1)
			System.out.println(a.head.getData());
		LinkedListStack stack=new LinkedListStack();
		Node temp=a.head;
		while(temp!=null)
		{
			stack.push(temp.getData());
			temp=temp.next;
		}
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}
}
//		public static void printRecursively(SinglyLinkedList a)
//	{
//		Node temp=a.head;
//		if(temp==null)
//			return;
//			printRecursively(temp.next);
//			System.out.println(temp.getData());
//		
//		