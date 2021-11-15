package string;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("USING BUILT IN FUNCTION");
		System.out.println("Enter the string");
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		if (s.equals(sb.toString())) {
			System.out.println("String is pallindrom!!");
		} else {
			System.out.println("String is not pallindrom!!");
		}

		System.out.println("\nWITHOUT BUILT IN FUNCTION");
		boolean b = false;
		int length = s.length();
		int i = 0, j = length - 1;
		while (j > i) {
			char fwdChar = s.charAt(i++);
			char bkwdChar = s.charAt(j--);
			if (fwdChar != bkwdChar) {
				b = true;
				break;
			}
		}
		if (b) {
			System.out.println("String is not Palindrome!!");
		} else {
			System.out.println("String is Pallindrome!!");
		}
		sc.close();
	}

}
