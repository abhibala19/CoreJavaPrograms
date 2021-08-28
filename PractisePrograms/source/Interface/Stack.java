package Interface;

public interface Stack {
	public void push(int element);

	public int pop();

	public int peek();

	public void printElements();
}

class ArrayStack implements Stack {
	int[] a= new int[10];
	static int count = 0;

	public void push(int n) {
		if (count < a.length) {
			a[count] = n;
			count++;
		}
	}
	public int pop()
	{
		if(count>0) {
			
			return a[--count];
		}
		
		return 0;
		
	}
	public int peek()
	{
		if(count>=0) {
			return a[count-1];
		}
		return 0;
	}
	public void printElements()
	{
		for(int i=0;i<count;i++)
		{
			System.out.print(a[i]);
		}
	}
}
