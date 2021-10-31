package Java_IO_LabAssignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q4_Count_File_Length {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("count.txt");
			fw.write("Hello there!");
			fw.close();
			FileReader fr = new FileReader("count.txt");
			int i;
			int count = 0;
			while ((i = fr.read()) != -1) {
				count++;
			}
			System.out.println("file lenght is = " + count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
