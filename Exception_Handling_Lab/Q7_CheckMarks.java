package lab;

import java.util.Scanner;

class MarksExceedException extends Exception {
	MarksExceedException() {
		super("Marks Exceed!!");
	}
}

public class Q7_CheckMarks {

	static void check_internal(int i) throws MarksExceedException {
		if (i > 40) {
			throw new MarksExceedException();
		} else {
			System.out.println("Internals--> " + i);
		}

	}

	static void check_external(int e) throws MarksExceedException {
		if (e > 60) {
			throw new MarksExceedException();
		} else {
			System.out.println("Externals--> " + e);
		}

	}

	public static void main(String[] args) throws MarksExceedException {

//		check_internal(100);
//		check_external(100);

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the internal marks");
			int n = sc.nextInt();
			check_internal(n);
			sc.close();
		} catch (MarksExceedException i) {
			System.out.println("internal marks exceed");
		}

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the external marks");
			int n = sc.nextInt();
			check_external(n);
			sc.close();
		} catch (MarksExceedException e) {
			System.out.println("external marks exceed");
		}

	}

}
