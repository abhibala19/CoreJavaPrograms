package iolab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter the path");
		String path=sc2.nextLine();
		System.out.println("enter the word to search");
		String word=sc1.next();
		File f=new File(path);
		if(f.exists() && f.isFile())
		{
			int n=countNoOfTimes(f,word);
			System.out.println(" the word "+word+" present in "+n+" no of times");
		}
		if(f.exists() && f.isDirectory())
		{
			int sum=0;
			File[] fa=f.listFiles();
			for(File fi:fa)
			{
			sum=sum+countNoOfTimes(fi,word);	
			}
			System.out.println(" the word "+word+" present in "+sum+" no of times");
		}
		}

	public static int countNoOfTimes(File f, String word) {
		List<String> l = new ArrayList<String>();
		int n=0;
		if (f.getName().endsWith(".txt")) {
			BufferedReader br = null;
			String line;
			try {
				br = new BufferedReader(new FileReader(f));
				while ((line = br.readLine()) != null) {
					String[] s=line.split(" ");
					for(String d:s) {
					l.add(d);
					}
				}
				 n = Collections.frequency(l, word);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

		}
return n;
	}

}
