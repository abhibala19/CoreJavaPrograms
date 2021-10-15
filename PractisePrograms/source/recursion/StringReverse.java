package recursion;

public class StringReverse {
public static void main(String[] args) {
	System.out.println(reverseAString("hello"));
}
public static String reverseAString(String s)
{
	if(s.length()==1)
		return s;
	return s.charAt(s.length()-1)+reverseAString(s.substring(0,s.length()-1));
}
}
