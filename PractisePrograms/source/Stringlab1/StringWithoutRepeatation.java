package Stringlab1;

public class StringWithoutRepeatation {
 public static void main(String[] args) {
	String s=removeDuplicate("1112k22333");
	System.out.println(s);
}
 public static String removeDuplicate(String s) {
		char[] a = s.toCharArray();
	    StringBuilder sb=new StringBuilder("");
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			flag = true;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					flag = false;
				}
			}
			if (flag) {
			sb.append(a[i]);
			}
		}
		String s1=sb.toString();
		return s1;
	}

}
