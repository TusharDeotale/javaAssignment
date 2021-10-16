package pgdacb;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

// Q1 Write a program to calculate the sum of first 10 natural number.
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the limit :");

		int n = s.nextInt();
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + (i + 1);
		}
		System.out.println("The sum of first " + n + " natural number is " + sum);
		s.close();

// Q 2 Write a program that prompts the user to input a positive integer. It
// should then print the multiplication table of that number.

		Scanner c = new Scanner(System.in);
		System.out.print("Enter the positive integer :");
		int n1 = c.nextInt();

		System.out.println("Multiplication Table of " + n1 + " is :");
		for (int i = 0; i < 10; i++) {
			System.out.println(n1 + " X " + (i + 1) + " = " + n1 * (i + 1));
		}
		c.close();

// Q 3 Write a program that prompts the user to input an integer and then
// outputs the number with the digits reversed. For example, if the input is
// 12345, the output should be 54321.

		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the number :");
		int m = s1.nextInt();
		int num = 0;
		System.out.print("The reversed number of " + m + " is : ");
		while (m != 0) {
			num = num * 10 + (m % 10);
			m = m / 10;
		}
		System.out.println(num);
		s1.close();

//Q 4 Write a do-while loop that asks the user to enter two numbers. 
//The numbers should be added and the sum displayed. 
//The loop should ask the user whether he or she wishes to perform the operation again. 
//If so, the loop should repeat; otherwise it should terminate.(while loop)		

		Scanner ss = new Scanner(System.in);
		do {
			System.out.print("Enter the first number : ");
			int m1 = ss.nextInt();
			System.out.print("Enter the second number : ");
			int n2 = ss.nextInt();

			int add = m1 + n2;
			System.out.println("The sum of the given number is : " + add);
			System.out.println("Do you want to perform the operation again? If yes then enter 1 ");
			int n3 = ss.nextInt();
			if (n3 != 1)
				break;
		} while (true);
		ss.close();

//Q 5 Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

		int t, x, temp, sum1 = 0;
		int sr = 1;
		int er = 500;
		System.out.print("Amstrong Numbers are --> ");

		for (int i = sr + 1; i <= er; i++) {
			temp = i;
			sum1 = 0;
			while (temp != 0) {
				t = temp % 10;
				x = t * t * t;
				sum1 = sum1 + x;
				temp = temp / 10;
			}
			if (i == sum1)
				System.out.print(i + ", ");
		}

//Q 7 Patterns :
//	1)	********
//		********
//		********
//		********

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//	2)	*
//		**
//		***
//		****
//		*****

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//	3)   -----*
//	     -----**
//	     -----***
//	     -----****
//	     -----*****

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

//  4)   --------*
//       ------***
//       ----*****
//       --*******
//       *********

		for (int i = 1; i <= 5; i++) {

			for (int j = i * 2 - 1; j <= 8; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

//  5)    --------1
//        ------222
//        ----33333
//        --4444444
//        555555555

		int num1 = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = i * 2 - 1; j <= 8; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(num1);
			}
			System.out.println();
			num1++;
		}

//Q 8 Print ASCII values and their equivalent characters. ASCII value vary from 0 to 255.

		for (int i = 0; i <= 255; i++) {
			System.out.println("ASCII value of character " + (char) i + " is " + i);
		}

//Q 9 Write a program in java to find the sum of the even and odd digits of the number which is given as input.

		Scanner c1 = new Scanner(System.in);
		System.out.println("Enter the number ");
		int f = c1.nextInt();
		int num3 = 0;

		while (f != 0) {
			num3 = (num3 * 10) + f % 10;
			f = f / 10;
		}

		int evenDigitSum = 0, oddDigitSum = 0, l = 1;

		while (num3 != 0) {
			if (l % 2 == 0) {
				evenDigitSum = evenDigitSum + num3 % 10;
			} else
				oddDigitSum = oddDigitSum + num3 % 10;
			num3 = num3 / 10;
			l++;
		}
		System.out.println("The sum of the even digit number is " + evenDigitSum);
		System.out.println("The sum of the odd digit number is " + oddDigitSum);
		c1.close();

	}

}
