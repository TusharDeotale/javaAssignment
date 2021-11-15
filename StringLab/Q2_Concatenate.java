package string;

import java.util.Scanner;

//Q 2 Write a Java program to concatenate a given string to the end of another string

public class Q2_Concatenate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String.");
		String s1 = sc.nextLine();
		System.out.println("Enter string to concatenate.");
		String s2 = sc.nextLine();
		String result = s1 + s2;
		System.out.println("After concatenation \n" + result);
		sc.close();
	}

}
