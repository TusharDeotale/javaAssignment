package pgdacb;

import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int sz = sc1.nextInt();
		int[] a1 = new int[sz];
		int even1 = 0, odd1 = 0;

		System.out.println("Enter the numbers : ");
		for (int i1 = 0; i1 < sz; i1++) {
			a1[i1] = sc1.nextInt();
		}

		for (int y : a1) {
			System.out.print(" " + y);
		}
		System.out.println();

		for (int i1 = 0; i1 < sz; i1++) {
			if (a1[i1] % 2 == 0) {
				even1++;
			}
		}
		for (int i1 = 0; i1 < sz; i1++) {
			if (a1[i1] % 2 != 0) {
				odd1++;
			}
		}
		int[] ar_even = new int[even1];
		int[] ar_odd = new int[odd1];
		int e = 0, o = 0;
	//	System.out.println("Even array ");
		for (int i1 = 0; i1 < sz; i1++) {
			if (a1[i1] % 2 == 0) {
				ar_even[e] = a1[i1];
				System.out.print(" " + ar_even[e]);
			}
			else
			{
				ar_odd[o] = a1[i1];
				System.out.print(" " + ar_odd[o]);
				
			}
		}
		System.out.println();


//		int[] ar_odd = new int[odd1];
//		int o = 0;
//		System.out.println("Odd array ");
//		for (int j = 0; j < sz; j++) {
//			if (a1[j] % 2 != 0) {
//				ar_odd[o] = a1[j];
//				System.out.print(" " + ar_odd[o]);
//			}
//
//		}


	}

}
