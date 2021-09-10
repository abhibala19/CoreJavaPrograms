package lab8;

public class IntStack {
	int count = 0;
	private int[] value = new int[10];

	public void push(int n) {
		if (count < 10) {
			value[count++] = n;
		} else
			System.out.println("only 10 values are allowed");

	}
	public int pop()
	{
		int i=0;
		if(count>0)
		{
			i=value[count-1];
			count--;
		}
		return i;
	}
	public void printValue()
	{
		for(int i=0;i<count;i++)
		{
			System.out.print(value[i]);
		}
	}
}