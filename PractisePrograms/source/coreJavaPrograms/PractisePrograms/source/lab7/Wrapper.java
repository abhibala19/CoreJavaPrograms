package coreJavaPrograms.PractisePrograms.source.lab7;

public class Wrapper {
public static void main(String[] args) {
	int i=10;
	Integer i1=new Integer(i);
	Character c=new Character('a');
	Double d=new Double(6.7);
	i=i1.intValue();
    char c1=c.charValue();
	int j=Integer.parseInt("45");
	double f=Double.parseDouble("4.5");
	System.out.println(j);
	System.out.println(f);
	System.out.println(c1);
	System.out.println(i);
	String s="10";
	int g=100;
	String str=String.valueOf(5.6);
	String s2=String.valueOf(10L);
	String s3=String.valueOf(g);
	System.out.println(str);
	System.out.println(s2);
	System.out.println(s3);
	Character.isDigit('f');
	Character.isLetter('7');
	Character.toUpperCase('h');
}
}
