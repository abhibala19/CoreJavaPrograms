package iolab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortAFile {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	System.out.println("enter the file path");
	String path=sc2.nextLine();
	BufferedReader br=null;
	File f=new File(path);
	List<String> l=new ArrayList<String>();
	Set<String> t=new TreeSet<String>();
	String g = null;
	if(f.exists() && f.getName().endsWith(".txt"))
	{
		String line;
		try
		{
			br=new BufferedReader(new FileReader(path));
			while((line=br.readLine())!=null)
			{
				String[] a=line.split(" ");
				for(String d:a)
				{
					l.add(d);
					t.add(d);
				}
			}
			Collections.sort(l);
			System.out.println(l);
			System.out.println(t);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(br!=null)
			{
				try
				{
					br.close();
					
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
}
}
}