package iolab;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter the path1");
		String path1=sc2.nextLine();
		System.out.println("enter the second path");
		
		String path2=sc2.nextLine();
		FileReader fr=null;
		FileWriter fw=null;
		try
		{
			fr=new FileReader(path1);
			fw=new FileWriter(path2);
			int c=0;
			while((c=fr.read())!=-1)
			{
				System.out.println((char)c);
				fw.write(c);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			if(fr!=null) {
				try {
				fr.close();
				}
			catch(IOException e)
				{
				e.printStackTrace();
				}
				
		}
			if(fw!=null)
			{
				try {
					fw.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
	}

}

}