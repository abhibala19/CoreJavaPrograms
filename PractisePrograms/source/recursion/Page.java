package recursion;

public class Page {
public static void main(String[] args) {
	System.out.println(findNoOfPages(160,4));
}
public static int findNoOfPages(int n,int a)
{
	if(n<0)
		return 0;
	return findNoOfPages(n-a, a)+1;
}
}
