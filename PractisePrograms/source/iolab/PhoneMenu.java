package iolab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneMenu {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	int ch=0;
	List<String> l=new ArrayList<String>();
	while(ch!=5)
	{
		System.out.println("press 1 to add a contact");
		System.out.println("pressn 2 to list");
		System.out.println("press 3 to delete a contact");
		System.out.println("press 4 to update ");
		String no;
	System.out.println("enter the choice");
	ch=sc1.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("adding");
		System.out.println("enter the phone no to add");
		no=sc1.next();
		l.add(no);
		break;
	case 2:
		System.out.println("listing");
		System.out.println(l);
		break;
	case 3:
		System.out.println("deleting");
		System.out.println("enter the no you want to delete from a book");
		no=sc1.next();
		l.remove(no);
		break;
	case 4:
		System.out.println("updating");
		System.out.println("enter the no to be updated");
		no=sc1.next();
		l.remove(no);
		System.out.println("enter the new no to update");
		no=sc1.next();
		l.add(no);
		break;
		default:
			System.out.println("the choices are between 1to 4");
	}
	}
}
}
