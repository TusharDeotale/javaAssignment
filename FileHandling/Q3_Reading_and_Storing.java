package Java_IO_LabAssignment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q3_Reading_and_Storing {

	public static void main(String[] args) {
		// Creating a file.
		File f = new File("f1.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Writing content to file.
		Scanner sc = new Scanner(System.in);
		System.out.println("Write content to file.");
		String content = sc.nextLine();

		try {
			FileWriter fw = new FileWriter(f);
			fw.write(content);
			fw.close();

			// Reading file content.
			FileReader fr = new FileReader(f);
			char[] c = new char[(int) f.length()];
			fr.read(c);
			fr.close();

			// Storing file content to another file.
			FileWriter fw1 = new FileWriter("f2.txt");
			fw1.write(c);
			fw1.close();
			System.out.println("Content has been written to a file and stored to the another file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close(); 
	}

}
