package Threadslab;

import java.io.IOException;
import java.util.Scanner;

public class TestLetter {
public static void main(String[] args) {
	System.out.println("rtgrrtgrtg");
	try {
	Scanner sc1=new Scanner(System.in); 
	Scanner sc2=new Scanner(System.in); 
	System.out.println("enter the path");
	String path=sc2.nextLine();
	LetterCounterJob c=new LetterCounterJob(path);
	NextPrimeJob p=new NextPrimeJob(100000L);
	Thread t1=new Thread(c);
	Thread t2=new Thread(p);
	t1.start();
	t2.start();
	System.out.println(t1.getState());	
	t2.join();
	t1.join();
	System.out.println("afterjoin"+t1.getState());
	System.out.println("the noof letters in the given path "+c.getOutput());
	System.out.println("the largest primrno is "+p.getResult());
	}
	catch(InterruptedException  e)
	{
		e.printStackTrace();
	}
}
}
