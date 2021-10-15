package Collectionlab3;

public class ArrayStack implements Stack{
int[] arr=new int[10];
int count=0;
@Override
	public void push(int n) {
		// TODO Auto-generated method stub
	if(count<10)
		arr[count++]=n;
	else {
		int[] a=new int[arr.length*2];
	for(int i=0;i<arr.length;i++)
	{
		a[i]=arr[i];
	}
	arr=a;
	arr[count++]=n;
	}
	}
public int pop()
{
	if(count>0)
	{
	
	return arr[--count];
	}
else 
	throw new IllegalArgumentException("first add elements");
}
public int peek()
{
	return arr[count-1];
}
public void printElements()
{
	for(int i=count;i>0;i--)
	{
		System.out.print(arr[i-1]);
	}
	System.out.println();
}
}
