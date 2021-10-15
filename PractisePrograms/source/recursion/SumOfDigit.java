package recursion;

public class SumOfDigit {
public static void main(String[] args) {
	int n=findSumOfDigit(1234);
	System.out.println(n);
}
public static int findSumOfDigit(int num)
{
	if(num<10)
		return num;
	return num%10+findSumOfDigit(num/10);
	
}

}
