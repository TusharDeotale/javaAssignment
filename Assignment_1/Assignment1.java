package pgdacb;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {

// 1 Write a Java program to print 'Hello' on screen and then print your name on
// a separate line.

		System.out.println("Hello,");
		System.out.println("Tushar!");
		System.out.println("");

// Q 2 Wap to swap two numbers

		int x = 10, y = 20, temp;

		System.out.println("Befor swap x = " + x + " & y= " + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("After swap x = " + x + " & y = " + y);
		

// Q 3 How to swap two numbers without using a third variable?

		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter the value of a");
		int a = sc.nextInt();

		System.out.println("Enter the vaulue of b");
		int b = sc.nextInt();

		System.out.println("Before swap value of a = " + a + " & " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swap value of a = " + a + " & " + b);
		sc.close();
		

// Q 4 wap to check is number is even or odd.

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number");
		int k = sc1.nextInt();

		if (k % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd nuber");
		}
		sc1.close();
		

// Q 5 wap to print fibonacci series.

		int q, w = 0, r = 1, t;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the limit...");
		q = sc2.nextInt();

		for (int i = 0; i < q; i++) {
			System.out.print(" " + w);
			t = w + r;
			w = r;
			r = t;
		}
		sc2.close();

// Q 6 wap to check value is within range or not.

		int range = 100;
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the number...");
		int m = sc3.nextInt();

		if (m < range) {
			System.out.println("Entered value is in the given range!");
		} else {
			System.out.println("You have exceeded the given range! The maximum input range is 100");
		}
		sc3.close();
		

// Q 7 A school has following rules for grading system:

		Scanner sc4 = new Scanner(System.in);
		System.out.print("Please enter the marks : ");
		int marks = sc4.nextInt();

		if (marks < 25) {
			System.out.println("F");
		} else if (marks >= 25 && marks < 45) {
			System.out.println("E");
		} else if (marks >= 45 && marks < 50) {
			System.out.println("D");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("c");
		} else if (marks >= 60 && marks < 80) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
		sc4.close();

// Q 8 Take values of length and breadth of a rectangle from user and check if
// it is square or not. hint is length==breath square else rectangle

		Scanner sc5 = new Scanner(System.in);
		System.out.println("Enter the value of length : ");
		int length = sc5.nextInt();
		System.out.println("Enter the value of breadth : ");
		int breadth = sc5.nextInt();

		if (length == breadth) {
			System.out.println("The object is Square!");
		} else {
			System.out.println("The object is Rectangle!");
		}
		sc5.close();

// Q 9 check and print greater number among two numbers

		Scanner c = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a1 = c.nextInt();

		System.out.println("Enter the value of b");
		int b1 = c.nextInt();

		int c1 = a1 < b1 ? a1 > b1 ? a1 : b1 : a1;
		System.out.println("The greater number among two number is : " + c1);
		c.close();

// Q 10 check and print greater number among three numbers

		Scanner s = new Scanner(System.in);
		System.out.println("Eenter first value :");
		int aa = s.nextInt();
		System.out.println("Eenter second value :");
		int bb = s.nextInt();
		System.out.println("Eenter third value :");
		int cc = s.nextInt();

		if (aa > bb && aa > cc) {
			System.out.print("Greater number among three numbers is : " + aa);
		} else if (bb > aa && bb > cc) {
			System.out.print("Greater number among three numbers is : " + bb);

		} else {
			System.out.println("Greater number among three numbers is : " + cc);

		}
		s.close();

// Q 11 Write a program to print absolute vlaue of a number entered by user.

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter the value :");
		int n = scr.nextInt();

		if (n < 0)
			System.out.println(-1 * n);

		else
			System.out.println(n);
		scr.close();

// Q 12 check alphabet is in lower case (a-z)(97-122) or upper case (A-Z)(65-90)

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Alphabate");
		char ch = s1.next().charAt(0);
		int alph = ch;

		if (alph >= 65 && alph <= 90)
			System.out.println("Upper case!");

		else
			System.out.println("Lower case!");
		s1.close();

// Q 13 print the expression and see the output
//		If
//		x = 2
//		y = 5
//		z = 0
//		then find values of the following expressions:
//			a. x == 2
//			b. x != 5
//			c. x != 5 && y >= 5
//			d. z != 0 || x == 2
//			e. !(y < 10)

		int x1 = 2, y1 = 5, z1 = 0;

		System.out.println(x1 == 2);
		System.out.println(x1 != 5);
		System.out.println(x1 != 5 && y1 >= 5);
		System.out.println(z1 != 0 || x1 == 2);
		System.out.println(!(y1 < 10));

// Q 14 Check if a given number is leap year or not

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Year :");
		int qx = scn.nextInt();

		if (qx % 400 == 0 || qx % 4 == 0) {
			System.out.println(qx + " is a Leap Year!!");
		} else {
			System.out.println(qx + " is Not a leap year");
		}
		scn.close();

// Q 15 wap to calculate simple interest Simple Interest

		Scanner scr1 = new Scanner(System.in);
		System.out.println("Enter the value of Principle ,Time & Rate respectively");
		int p1 = scr1.nextInt();
		int t1 = scr1.nextInt();
		int r1 = scr1.nextInt();

		System.out.println("The simple interest of Principle " + p1 + " at the rate of " + r1 + " for " + t1
				+ " units of time is = " + (p1 * t1 * r1) / 100);
		scr1.close();

// Q 16 Wap to print perimeter of a rectangle

		Scanner scr2 = new Scanner(System.in);
		System.out.println("Enter the value of Lenght and Breadth of the rectangle.");
		int dim1 = scr2.nextInt();
		int dim2 = scr2.nextInt();
		System.out.println("Perimeter of a Rectangle  A B C D is " + 2 * (dim1 + dim2));
		scr2.close();

// Q 17 Java Program to Check Whether the Character is Vowel or Consonant.

		Scanner scr3 = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char ch1 = scr3.next().charAt(0);

		if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
			System.out.println(ch1 + " is a Vowel!!");

		} else
			System.out.println(ch1 + " is a Consonant!!");
		scr3.close();

	}

}
