package iolab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteWithBufferReader {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	System.out.println("enter the path1");
	String path1=sc2.nextLine();
	System.out.println("enter the second path");
	
	String path2=sc2.nextLine();
BufferedReader br=null;
FileWriter fw=null;
try {
	br=new BufferedReader(new FileReader(path1));
	fw=new FileWriter(path2,true);
	String line;
	while((line=br.readLine())!=null)
	{
		System.out.println(line);
		fw.write(line);
	}
}
catch(IOException e)
{
	e.printStackTrace();
}
finally
{
	if(br!=null)
	{
		try {
	
		br.close();
	}
	
	catch(IOException e)
	{
		e.printStackTrace();
	}
		
}
	if(fw!=null)
	{
		try {fw.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
}
}