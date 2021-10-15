package iolab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter the path");
		String path = sc2.nextLine();
		File f = new File(path);
		if (f.exists() && f.isDirectory()) {
			File[] fa = f.listFiles();
			for (File fi : fa) {

				if (fi.isFile() && fi.getName().endsWith(".txt")) {
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(fi));
						String line;
						System.out.println("reading the contents of " + fi.getName());
						while ((line = br.readLine()) != null)
							
						{
							System.out.println(line);
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

			}
		}
		else
			System.out.println("give one path as input");

	}
}
