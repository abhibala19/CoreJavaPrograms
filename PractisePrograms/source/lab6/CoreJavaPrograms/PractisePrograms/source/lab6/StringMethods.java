package CoreJavaPrograms.PractisePrograms.source.lab6;

public class StringMethods {
	public static void main(String[] args) {
		
		String str="blah";
		str.toUpperCase();
		System.out.println(str);//blah string manipulation creates new String
		str="  blah  ";
		System.out.println(str.trim());//cut the leading and trailling spaces
		System.out.println(str.length());
		String s1=new String("abc");
		String s2=new String("abc");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		
	}

}
