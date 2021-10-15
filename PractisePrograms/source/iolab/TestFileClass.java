package iolab;

import java.io.File;
import java.util.Scanner;


public class TestFileClass {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter the path");
		String path=sc2.nextLine();
		File f=new File(path);
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.canRead());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.length());
		File[] fa=f.listFiles();
		for(File g:fa)
		{
			if(g.exists() && g.isFile())
			{
				System.out.println(f.exists());
				System.out.println(f.isFile());
				System.out.println(f.isDirectory());
				System.out.println(f.canRead());
				System.out.println(f.getAbsolutePath());
				System.out.println(f.getName());
				System.out.println(f.length());
				
			}
		}
		
		
	}

}
