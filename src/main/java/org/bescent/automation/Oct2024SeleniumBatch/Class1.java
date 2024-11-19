package org.bescent.automation.Oct2024SeleniumBatch;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//write into text file
public class Class1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./mySampleTextFile2.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i;
		bis.read();
		bis.read();
		bis.read();
		bis.read();
		while ((i = bis.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
	}
}
