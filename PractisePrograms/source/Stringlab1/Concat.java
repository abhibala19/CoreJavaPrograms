package Stringlab1;

public class Concat {
	public static void main(String[] args) {
		String s="happynew";
		s.concat("year");
		System.out.println(s);
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.append("abc"));
		System.out.println(sb.reverse());
		System.out.println(sb.insert(0, "we"));
		sb.replace(0,2, "welcome");
		String s1=sb.toString();
		System.out.println(s1);
		
		
	}

}
