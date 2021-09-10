package lab8;

public class Wrapper {
	public static void main(String[] args) {
		Integer i=new Integer(5);
		Character c=new Character('g');
		Float f=new Float(7.8f);
		Double d=new Double(8.9);
		Long k=new Long(78);
		System.out.println(i.intValue());

		System.out.println(c.charValue());
		System.out.println(f.floatValue());
		System.out.println(k.longValue());
		System.out.println(d.doubleValue());
		System.out.println(Character.isLetter('p'));
		System.out.println(Character.isDigit('p'));
		System.out.println(Character.isUpperCase('p'));
		System.out.println(Character.isLowerCase('p'));
		System.out.println(Character.toUpperCase('k'));
		System.out.println(Character.toLowerCase('O'));
		
String s1=String.valueOf(56);
String s2=String.valueOf(7.8);		
String s3=String.valueOf(89L);		
String s4=String.valueOf(65.0f);		
String s5=String.valueOf('7');		
System.out.println(s1+" "+s3+" "+s2+" "+s4+" "+s5);
int u=Integer.parseInt(s1);
System.out.println(Double.parseDouble(s2));
	System.out.println(u);
	}

}
