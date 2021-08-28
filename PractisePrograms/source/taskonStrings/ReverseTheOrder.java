package taskonStrings;

public class ReverseTheOrder {
	public static void main(String[] args) {
		String s="i am good girl and very talented";
		String a=reverseTheOrder(s);
		System.out.println("after reversing the order "+ a);
		
		
	}
	public static String reverseTheOrder(String s)
	{
		String[] s1=s.split(" ");
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<s1.length;i++)
		{
			sb.append(s1[s1.length-i-1]+" ");
		}
		String s2=sb.toString();
		return s2;

}
}