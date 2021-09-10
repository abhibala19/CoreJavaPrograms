package exception;

import CoreJavaPrograms.PractisePrograms.source.inheritance.Cat;
import CoreJavaPrograms.PractisePrograms.source.inheritance.Monkey;
import CoreJavaPrograms.PractisePrograms.source.inheritance.Animal;
import coreJavaPrograms.PractisePrograms.source.lab5.Person;

public class RuntimeException {
public static void main(String[] args) {
	try
	{
//	Person p=null;
//	System.out.println(p.getName());
//   int i=Integer.parseInt(args[0]);
//	System.out.println(i);
	
//	Animal a=new Monkey("mangoos");
//	Cat c=(Cat)a;
	Test.main(args);
	Animal[] s=new Animal[100000];
	for (int j = 0; j < s.length; j++) {
		 s[j]=new Animal("hippo");
	}
	}
	catch(NullPointerException n)
	{
		n.printStackTrace();
	}
	catch(NumberFormatException p)
	{
		p.printStackTrace();
	}
	catch(ClassCastException j)
	{
		j.printStackTrace();
	}
	catch(OutOfMemoryError e)
	{
		e.printStackTrace();
	}
catch(StackOverflowError r)
{
	r.printStackTrace();
}
	System.out.println("after catch main");
}
}