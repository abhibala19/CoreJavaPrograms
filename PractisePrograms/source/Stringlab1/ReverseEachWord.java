package Stringlab1;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s="i am a good girl";
		String s1=reverseASentence(s);
	    System.out.println(s1);
	}
	public static String reverseASentence(String s)
	{
		StringBuilder sb=new StringBuilder("");
		String[] a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			sb.append(Reverse1.findReverse(a[i])+" ");
		}
		String s2=sb.toString();
		return s2;
	}

}
