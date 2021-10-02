package collections;

public class LinkedListStack implements Stack {
	Node1 top;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size > 0)
			this.size = size;
		else
			throw new IllegalArgumentException("size is invalid");
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (size == 0)
			return true;
		else
			return false;
	}

	@Override
	public void push(String data) {
		// TODO Auto-generated method stub
		Node1 n = new Node1(data);

		if (top == null)
			top = n;
		else {
			n.next=top;
			top = n;
		}
		size++;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub

		return top.getData();
	}	

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		if (size==0)
			throw new IllegalArgumentException("stack is empty");
		else {
			Node1 temp = top;
			top= top.next;
			temp.next = null;
			return temp.getData();
		}

	}@Override
			public void printElements() {
				// TODO Auto-generated method stub
			if(size==0)
				System.out.println("no element to print");
				else
				{
			Node1 temp=top;
			while(temp!=null)
			{
		System.out.println(temp.getData());
				temp=temp.next;
			}
				}
			}@Override
			public int size() {
				// TODO Auto-generated method stub
				return size;
			}
	
}
