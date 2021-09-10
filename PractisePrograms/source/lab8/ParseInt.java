package lab8;

public class ParseInt {
	public static void main(String[] args) {
		String s = "2445";
		int i = parseInt(s);
		System.out.println(i);
	}

	public static int parseInt(String s) {
		int r = 0, count = 1;
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(s.length() - i - 1);
			if (Character.isDigit(c)) {
				int c1=c-48;
					r = r + (count * (int)c1);
				}
			count = count * 10;
		}
		return r;
	}
}