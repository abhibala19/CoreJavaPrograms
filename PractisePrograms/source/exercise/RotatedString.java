package exercise;

public class RotatedString {
	public static boolean isStringRotated(String s1, String s2) {
		if(s2.length()>s1.length())
			return false;
		int n=s2.indexOf(s1.charAt(0));
		String d=s2.substring(n)+s2.substring(0,n);
		if(s1.equals(d))
		return true;
		else
		return false;
	}public static void main(String[] args) {
		String s1="hello";
		String s2="ppyah";
		System.out.println(isStringRotated(s1, s2));
	}
}
