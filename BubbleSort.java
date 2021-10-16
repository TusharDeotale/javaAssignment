package pgdacb;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc2.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter the number : ");
		for (int i1 = 0; i1 < n; i1++) {
			arr1[i1] = sc2.nextInt();
		}

		for (int y : arr1) {
			System.out.print(y + " ");
		}
		System.out.println();

		int temp;
		boolean b1 = false;
		for (int k = 0; k < n - 1; k++) {
			b1 = true;
			for (int j = 0; j < n - 1 - k; j++) {
				
				if (arr1[j] > arr1[j + 1]) {
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
					b1 = false;
				}
			}
			if(b1)
				System.out.println("Existing array is sorted!!");
			break;
		}

			for (int y : arr1)
				System.out.print(y + " ");

	}

}
