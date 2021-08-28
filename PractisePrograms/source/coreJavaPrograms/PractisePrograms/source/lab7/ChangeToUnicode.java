package coreJavaPrograms.PractisePrograms.source.lab7;

public class ChangeToUnicode {
	public static void main(String[] args) {
		String s = "asd";
		findUniCode(s);
	}

	public static void findUniCode(String s) {
		for (int i = 0; i < s.length(); i++) {
			int n = s.charAt(i);
			if (i < s.length() - 1)
				System.out.print(n + ".");
			else
				System.out.print(n);

		}
	}

}
