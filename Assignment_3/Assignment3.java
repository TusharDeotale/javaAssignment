package pgdacb;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		/*
		 */

		// Q 1 wap to ask 5 numbers from user in an array and print their sum.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the number : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int y : arr) {
			System.out.print(" " + y);
		}

		System.out.println();

		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}
		System.out.print("Sum of added no. is : ");
		System.out.println(sum);

//		Q 2 wap to ask 7 numbers from user and ask another number to be searched 
//		and check if number exists in an array or not print found or not found .

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int sze = s.nextInt();
		int ar[] = new int[sze];
		boolean b = true;

		System.out.println("Enter the numbers : ");
		for (int i = 0; i < sze; i++) {
			ar[i] = s.nextInt();
		}

		for (int y : ar) {
			System.out.print(" " + y);
		}
		System.out.println();

		System.out.print("Enter the number to be serched -> ");
		int num = s.nextInt();

		int i;
		for (i = 0; i < sze; i++) {
			if (num == ar[i]) {
				b = false;
				System.out.println("Number found at index " + i);
				break;
			}
		}
		if (b)
			System.out.println("Number Not Found!!");

		// Q 3 wap that ask 5 records from user and count even number and odd numbers
		// and print them.

		Scanner c = new Scanner(System.in);
		System.out.println("Enter the number of records : ");
		int records = c.nextInt();
		int[] a = new int[records];
		int even = 0, odd = 0;

		System.out.println("Enter the records : ");
		for (int i = 0; i < records; i++) {
			a[i] = c.nextInt();
		}

		for (int y : a) {
			System.out.print(" " + y);
		}
		System.out.println();

		for (int i1 = 0; i1 < records; i1++) {
			if (a[i1] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Number of even numbers are " + even);
		System.out.println("Number of odd numbers are " + odd);

		// Q 4 In above question copy even digits from above array to ar_even array
		// and odd digits to ar_odd array

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
		int[] ar_even = new int[even1];
		int e = 0;
		System.out.println("Even array ");
		for (int i1 = 0; i1 < sz; i1++) {
			if (a1[i1] % 2 == 0) {
				ar_even[e] = a1[i1];
				System.out.print(" " + ar_even[e]);
			}
		}
		System.out.println();

		for (int i1 = 0; i1 < sz; i1++) {
			if (a1[i1] % 2 != 0) {
				odd1++;
			}
		}

		int[] ar_odd = new int[odd1];
		int o = 0;
		System.out.println("Odd array ");
		for (int j = 0; j < sz; j++) {
			if (a1[j] % 2 != 0) {
				ar_odd[o] = a1[j];
				System.out.print(" " + ar_odd[o]);
			}

		}

		// Q 5 wap to sort a numeric array using bubble sort method.

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
			

		// Q 6 wap to find index of specifi element in an array

		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int sz1 = sc4.nextInt();
		int ary[] = new int[sz1];

		System.out.println("Enter the numbers : ");
		for (int i1 = 0; i1 < sz1; i1++) {
			ary[i1] = sc4.nextInt();
		}

		for (int y : ary) {
			System.out.print(y + " ");
		}
		System.out.println();

		System.out.print("Enter the specific element -> ");
		int num_1 = sc4.nextInt();

		int i1;
		for (i1 = 0; i1 < sz1; i1++) {
			if (num_1 == ary[i1]) {

				System.out.println("Number " + num_1 + " found at index " + i1);
				break;
			}
		}

		// Q 7 wap to copy one array to another .

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int sz2 = scr.nextInt();
		int arr3[] = new int[sz2];
		int cpy_arr[] = new int[sz2];
		System.out.println("Enter the number : ");
		for (int i = 0; i < sz2; i++) {
			arr3[i] = scr.nextInt();
		}

		for (int y : arr3) {
			System.out.print(" " + y);
		}

		System.out.println();

		for (int i = 0; i < sz2; i++) {
			cpy_arr[i] = arr3[i];
		}

		System.out.print("Copied array = ");
		for (int y : cpy_arr) {
			System.out.print(" " + y);
		}

		// Q 8 wap to find minimum and max number in an array

		Scanner sc5 = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int sz3 = sc5.nextInt();
		int array[] = new int[sz3];
		System.out.println("Enter the number : ");
		for (int i = 0; i < sz3; i++) {
			array[i] = sc5.nextInt();
		}

		for (int y : array) {
			System.out.print(" " + y);
		}
		System.out.println();
		int min = array[0], max = array[0];

		for (int i = 0; i < sz3 - 1; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Minimum number in the array is = " + min);
		System.out.println("Maximum number in the array is = " + max);

		// Q9 wap to ask 10 numners in an array and print them in reverse order

		Scanner sc6 = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int sz4 = sc6.nextInt();
		int array1[] = new int[sz4];

		System.out.println("Enter the number : ");
		for (int i = 0; i < sz4; i++) {
			array1[i] = sc6.nextInt();
		}

		for (int y : array1) {
			System.out.print(y + " ");
		}
		System.out.println();

		for (int I = sz4 - 1; I >= 0; I--) {
			System.out.print(array1[I] + " ");
		}

		// Q 10 wap to deisgn a menu driven application
//		  1 add two matrix 
//		  2 multiply to given matrix.
//		  3 exit 

		int row1, cols1, row2, cols2;
		Scanner sc7 = new Scanner(System.in);
		System.out.println("Enter the number of row 1 : ");
		row1 = sc7.nextInt();
		System.out.println("Enter the number of cols 1 : ");
		cols1 = sc7.nextInt();

		System.out.println("Enter the number of row 2 : ");
		row2 = sc7.nextInt();
		System.out.println("Enter the number of cols 2 : ");
		cols2 = sc7.nextInt();

		int[][] arry = new int[row1][cols1];
		int[][] brr = new int[row2][cols2];
		int[][] crr = new int[row1][cols2];

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < cols1; j++) {
				System.out.print("Enter arr[" + i + "][" + j + "] = ");
				arry[i][j] = sc7.nextInt();
			}
			System.out.println();
		}

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < cols1; j++) {
				System.out.print("Enter brr[" + i + "][" + j + "] = ");
				brr[i][j] = sc7.nextInt();
			}
			System.out.println();
		}

		System.out.println("Matrix A : ");
		for (int y[] : arry) {
			for (int p : y) {
				System.out.print(" " + p);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Matrix B : ");
		for (int y[] : brr) {
			for (int p : y) {
				System.out.print(" " + p);
			}
			System.out.println();
		}

		System.out.println("Enter 1, 2 & 3 for Addition , Multiplication & exit respectively.");
		int input = sc7.nextInt();

		switch (input) {

		case 1:
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < cols1; j++) {
					crr[i][j] = arry[i][j] + brr[i][j];
				}
			}

			System.out.println("\nAfter adding two Matrix 'arr' and 'brr' =");
			for (int y[] : crr) {
				for (int p : y) {
					System.out.print(" " + p);
				}
				System.out.println();
			}
			sc7.close();
			break;

		case 2:

			if (cols1 != row2) {
				System.out.println("Not possible..... cols1 and row2 should be same ");
				return;
			}

			for (int i1 = 0; i1 < row1; i1++) {
				for (int j = 0; j < cols2; j++) {
					for (int k = 0; k < row2; k++) {
						crr[i1][j] = crr[i1][j] + arry[i1][k] * brr[k][j];
					}
				}
			}
			System.out.println("\nAfter Multiplication two Matrix 'arr' and 'brr' =");

			for (int y[] : crr) {
				for (int p : y) {
					System.out.print(" " + p);
				}
				System.out.println();
			}
			sc7.close();
			break;

		default:
			System.out.println("Exit!");

		}

		// Q 11 Write a Java program to find a missing number in an array.

		Scanner s7 = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = s7.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter the number : ");
		for (int i1 = 0; i1 < n - 1; i1++) {
			arr1[i1] = s7.nextInt();
		}
		System.out.println();

		int sumOfAll = (n * (n + 1)) / 2; // -----> lerned this logic from tutorialspoint.com
		int sum = 0; // sum of array.
		for (int i = 0; i < n - 1; i++) {
			sum = sum + arr1[i];
		}
		int missingNumber = sumOfAll - sum;
		System.out.println("Missing number is: " + missingNumber);

		// Q 12 Write a Java program to get the difference between the largest and
		// smallest values in an array of integers.
		// The length of the array must be 1 and above

		Scanner x = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int sz5 = x.nextInt();
		int array[] = new int[sz5];
		System.out.println("Enter the number : ");
		for (int i1 = 0; i1 < sz5; i1++) {
			array[i1] = x.nextInt();
		}

		for (int y : array) {
			System.out.print(" " + y);
		}
		System.out.println();
		int min1 = array[0], max1 = array[0];

		for (int i1 = 0; i1 < sz5 - 1; i1++) {
			if (array[i1] < min1) {
				min1 = array[i1];
			}
			if (array[i1] > max1) {
				max1 = array[i1];
			}
		}
		System.out.println("Largest number = " + max1);
		System.out.println("Smallest number = " + min1);
		System.out.println("The difference between smallest and largest is = " + (max1 - min1));

		// Q 13 Write a Java program to print all the LEADERS in the array.

		Scanner x1 = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = x1.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the number : ");
		for (int i1 = 0; i1 < size; i1++) {
			array[i1] = x1.nextInt();
		}

		for (int y : array) {
			System.out.print(" " + y);
		}
		System.out.println();

		System.out.print("Leaders are = ");
		for (int i = 0; i < size; i++) {
			int j;
			for (j = i + 1; j < size; j++) {
				if (array[i] <= array[j])
					break;
			}
			if (j == size)
				System.out.print(array[i] + " ");
		}

		// Q 14 Write a Java program to cyclically rotate a given array clockwise by
		// one.

		Scanner x2 = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = x2.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the number : ");
		for (int i1 = 0; i1 < size; i1++) {
			array[i1] = x2.nextInt();
		}

		for (int y : array) {
			System.out.print(y + " ");
		}
		System.out.println();
		int z = array[size - 1];              // >>>learned this logic from tutuorialspoint.com
		for (int i = size - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = z;

		for (int y : array)
			System.out.print(y + " ");

	}
}
