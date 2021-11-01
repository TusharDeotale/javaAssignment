package Java_IO_LabAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {

	public static void main(String[] args) throws IOException {
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		char ch;
		char []c = new char[100];
		System.out.println("Enter a character \n press 'q' to exit: ");

		do {
			ch = (char) b.read();
			
		} while (ch != 'q');
		
		System.out.println("Exited!");
 
	}

}
