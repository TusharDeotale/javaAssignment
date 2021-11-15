package string;

import java.util.Scanner;

//Q 1 Write a Java program to get the character at the given 
//index within the String.

public class Q1_GetChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string..");
		String s = sc.nextLine();
		System.out.println("Enter the value of index");
		int i = sc.nextInt();
		System.out.println(s.charAt(i));
		sc.close();
	}
}
