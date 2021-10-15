package iolab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordNotInBothFile {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter the file path");
		String path1 = sc2.nextLine();
		System.out.println("enter the file path");
		String path2 = sc2.nextLine();

		File f = new File(path1);
		File f2 = new File(path2);
		int max = 0;
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		List<String> l3 = new ArrayList<String>();
		Set<String> t = new TreeSet<String>();
		l1 = createList(f);
		l2 = createList(f2);
		for (String g : l1) {
			if (l2.contains(g)) {
				continue;
			} else
				l3.add(g);
		}
		for (String g : l2) {
			if (l1.contains(g)) {
				continue;
			} else
				l3.add(g);
		}
		System.out.println(l3);
	}

	public static List createList(File f) {
		BufferedReader br = null;
		List<String> l1 = new ArrayList<String>();

		if (f.exists() && f.getName().endsWith(".txt")) {
			String line;
			try {
				br = new BufferedReader(new FileReader(f.getAbsolutePath()));
				while ((line = br.readLine()) != null) {
					String[] a = line.split(" ");
					for (String d : a) {
						l1.add(d);
					}
				}
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
		return l1;
	}
}

