package Collectionlab3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentMenu {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	Date dob=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat();
	List<Student> l=new ArrayList<Student>();
	int ch=0;
	Set<Student> s;
	while(ch!=4)
	{
		System.out.println("press 1 to add Student");
		System.out.println("press 2 to get student info based on id");
		System.out.println("sort student based on dob");
		System.out.println("press 4 to listing");
		System.out.println("enter your choice");
		ch=sc1.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("addind Student");
			Student s1;
			System.out.println("enter student name");
			String s2=sc1.next();
			System.out.println("enter student id");
			String s3=sc1.next();
			System.out.println("enter student emailid");
			String s4=sc1.next();
			System.out.println("enter Student dob(dd/mm//yy)");
			String s5=sc1.next();
			try
			{
			dob=new SimpleDateFormat("dd/mm/yyy").parse(s5);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			s1=new Student(s2,s3,s4,dob);
			l.add(s1);
			break;
		case 2:
			System.out.println("sorting based on id");
			StudentIdComparator sic=new StudentIdComparator();
			s=new TreeSet<Student>(sic);
			for(Student b:l) {
				s.add(b);
			}
			System.out.println(s);
			break;
		case 3:
			System.out.println("sorting by dob");
			s=new TreeSet<Student>(l);
			System.out.println(s);
			break;
		case 4:
			System.out.println("listing ");
			System.out.println(l);
			break;
			default:
				System.out.println("choices between 1 to 4");
		}
		
	}
}
}
