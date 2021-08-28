package Stringlab1;

public class Reverse1 {
public static void main(String[] args) {
	String s="arunai";
	String s1=findReverse(s);
	System.out.println(s1);
}
public static String findReverse(String s)
{
	StringBuilder  s1=new StringBuilder("");
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(s.length()-1-i);
		s1.append(c);
	}
	String s3=s1.toString();
	return s3;
}
}
