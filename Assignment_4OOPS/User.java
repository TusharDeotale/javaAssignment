package oops;

import java.util.Scanner;

public class User {
	int a = 0;

	User() {
		System.out.println(a);
	}

	User(int a) {
		this.a = a;
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1 = sc.nextInt();
		System.out.println("Type again!!");
		boolean n = sc.hasNextInt();
		if (n) {
			 new User(n1);
		} else {
			 new User();
		}
		sc.close();
	}

}
