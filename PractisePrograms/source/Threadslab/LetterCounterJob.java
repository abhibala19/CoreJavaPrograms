package Threadslab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LetterCounterJob implements Runnable {
	private String path;
	private int output;

	public int getOutput() {
		return output;
	}

	public LetterCounterJob(String path) {
		if (path == null && path.trim().equals(""))
			throw new IllegalArgumentException("path doesnot exist");
		else
			this.path = path;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		File f = new File(path);

		if (f.exists() && f.getName().endsWith(".txt")) {
			BufferedReader fr = null;
			try {
				fr = new BufferedReader(new FileReader(f.getAbsolutePath()));
				int n;
				while ((n = fr.read()) != -1) {

					char c = (char) n;
					if (Character.isAlphabetic(c))
						output++;
				}
				long t2=System.currentTimeMillis();

				System.out.println(t2);

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (fr != null) {
					try {
						fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
