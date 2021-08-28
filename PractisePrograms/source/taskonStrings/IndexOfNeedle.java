package taskonStrings;

public class IndexOfNeedle {
	public static void main(String[] args) {
		String s1 = "asdf";
		String s2 = "asdf";
		int n = findIndexOfNeedle(s1, s2);
		System.out.println(n);

	}

	public static int findIndexOfNeedle(String hastack, String needle) {
		int n = hastack.indexOf(needle);
		return n;
	}
}
