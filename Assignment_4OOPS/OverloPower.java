package oops;

import java.util.Scanner;

public class OverloPower {

	int power(int a) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Power");
		n = sc.nextInt();
		int sum = 1;
		for (int i = 0; i < n; i++) {
			sum = sum * a;
		}
		return sum;

	}

	float power(float a) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Power");
		n = sc.nextInt();
		float sum = 1.0f;
		for (int i = 0; i < n; i++) {
			sum = sum * a;
		}
		return sum;

	}

	public static void main(String[] args) {
		OverloPower o = new OverloPower();
		
		System.out.println("-----> " + o.power(2.0f));
	}

}
