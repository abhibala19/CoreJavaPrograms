package iolab;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintStream;
public class ReadAndWrite {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	System.out.println("enter the path1");
	String path1=sc2.nextLine();
	System.out.println("enter the second path");
	
	String path2=sc2.nextLine();
	try 	{
		FileReader f1=new FileReader(path1);
		FileWriter f2=new FileWriter(path2);
		int c;
		while((c=f1.read())!=-1)
		{
			System.out.println((char)c);
			f2.write(c);
		}
		f1.close();
		f2.close();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
}
