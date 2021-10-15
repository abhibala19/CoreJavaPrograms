package iolab;

import java.io.File;
import java.util.Scanner;

public class PrintAllFiles {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	System.out.println("enter the path");
	String path=sc2.nextLine();
	File f=new File(path);
	if(f.exists() && f.isDirectory())
	{
		File[] fa=f.listFiles();
		for(File fi:fa)
		{
		if(fi.getName().endsWith(".txt"))
		{
			System.out.println(fi.getName());
		}
		}
		
	}
}
}
