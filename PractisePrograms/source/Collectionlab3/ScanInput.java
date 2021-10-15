package Collectionlab3;

import java.util.Scanner;

public class ScanInput {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	System.out.println("enter your name");
	String name=sc1.next();
	System.out.println("enter Your age'");
	int age=sc1.nextInt();
	System.out.println("enter your salary");
	double salary=sc1.nextDouble();
	System.out.println("tell us abt ur self");
	String story=sc2.nextLine();
	System.out.println("name "+name+" age "+age+" salary "+salary+" abt yourself "+story);
}
}
