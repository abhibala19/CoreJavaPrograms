package taskonStrings;

public class ReplaceWord {
	public static void main(String[] args) {
	String s1 = "good good good bad bad bad";
	String s2 = "bad";
	String s3 = "verybad";

String s4=findReplace(s1,s2,s3);
System.out.println(s4);
}

	public static String findReplace(String s, String old, String newString) {
		if (s == null || s.trim().equals(""))
			return "emptyString";
		return s.replace(old, newString);
	}
}