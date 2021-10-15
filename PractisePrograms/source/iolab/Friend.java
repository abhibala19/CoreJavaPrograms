package iolab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Friend {
	public static void main(String[] args) {
		File f = new File("/home/abhi/abhijava/documents/friends.txt");

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		BufferedReader br = null;
		List<String> l = new ArrayList<String>();
		try {
			String line;
			if (f.getName().endsWith(".txt")) {
				br = new BufferedReader(new FileReader(f.getAbsolutePath()));
				while ((line = br.readLine()) != null) {
					System.out.println(line);
					l.add(line);
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				}

				catch (IOException e) {
					e.printStackTrace();

				}
			}
		}
		System.out.println("enter the friend name you want to edit");
		String edit = sc1.next();
		l.remove(edit);
		System.out.println("enter the name to replace");
		String replace = sc1.next();
		l.add(replace);
		FileWriter fw = null;

		try {
			fw = new FileWriter(f.getAbsolutePath());
			for (String g : l) {
				System.out.println("in file writter ," + g);
				fw.write(g);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				}

				catch (IOException e) {
					e.printStackTrace();

				}

			}

		}

	}
}
