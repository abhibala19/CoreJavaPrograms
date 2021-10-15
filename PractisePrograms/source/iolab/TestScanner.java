package iolab;

import java.util.Scanner;

public class TestScanner {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
System.out.println("enter a word");
String s=sc1.next();
System.out.println("word "+s);
System.out.println("enter a int as input");
int n=sc1.nextInt();
System.out.println("int value ="+n);
System.out.println("enter a sentence");
String s1=sc2.nextLine();
System.out.println("sentence ="+s1);
System.out.println("enter double as an input");
double d= sc1.nextDouble();
System.out.println("double value "+d);
System.out.println("enter byte as input");
byte b=sc1.nextByte();
System.out.println("byte value ="+b);
System.out.println("enter float value");
float f=sc1.nextFloat();
System.out.println("float value = "+f);
}
}

