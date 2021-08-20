package CoreJavaPrograms.PractisePrograms.source.lab6;

import java.util.Random;

public class RandomString {
	public static void main(String[] args) {
//		generateRandomString();
		generateRandomStringUsingChar();

	}

	public static void generateRandomString() {
		String s = "";
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 6; j++) {
				int d = (int) (Math.random() * 9);
				if (sb.length() < 6) {
					sb = sb.append(d);
				}
			}
			s = sb.toString();
			System.out.println("string " + i + " is " + s);
			sb = new StringBuilder("");
		}
	}
	public static void generateRandomStringUsingChar() {
		String s = "";
		StringBuilder sb = new StringBuilder(s);
		char[] c= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 6; j++) {
			  int v=(int)(Math.random()*26);
			  if(sb.length()<5)
			  sb.append(c[v]);
			  else
			  {
				  int v1=(int)(Math.random()*9);
				  sb.append(v1);
			  }
			}
			System.out.println("string " + i + " is " + sb);
			sb = new StringBuilder("");
		}
			  
			  
	}
}