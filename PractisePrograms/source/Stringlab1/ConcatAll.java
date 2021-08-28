package Stringlab1;

public class ConcatAll {
public static void main(String[] args) {
	String[] ar= {"blue","green","yellow","white","purple"};
	String s=doConcat(ar);
	System.out.println(s);
}
public static String doConcat(String[] s)
{
	StringBuilder sb=new StringBuilder("");
	for(int i=0;i<s.length;i++)
	{
		sb.append(s[i]);
	}
	String s1=sb.toString();
	return s1;
}
}
