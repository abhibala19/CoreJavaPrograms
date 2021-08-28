package taskonStrings;
public class Occurance {
	public static void main(String[] args) {
		String s = "raramaramaramaarama";
		String s1 = "ra";
		int a = numOfOccurance(s, s1);
		System.out.println(a);
	}

	public static int numOfOccurance(String s, String s1) {
		if (s == null || s1 == null) {
			return 0;
		}
		if (s.trim().equals(s1.trim())) {
			return 1;
		}
		if (s.equals(s1)) {
			return 1;
		}
		if (s1.length() > s.length()) {
			return 0;
		}
		if (!s.contains(s1)) {
			return 0;
		}
		int count = 0;
		int pos = 0;
		while ((pos = (s.indexOf(s1, pos))) != -1) {
			pos++;
			count++;
		}
		return count;
	}
}