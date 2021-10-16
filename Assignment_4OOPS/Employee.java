package oops;

import java.util.Scanner;

public class Employee {
	String eName;
	int id;

	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name and ID ");
		eName = sc.next();
		id = sc.nextInt();
	}

	void sort(Employee e[]) {
		boolean b = false;
		Employee temp = new Employee();
		for (int i = 0; i < 6 - 1; i++) {
			b = true;
			for (int j = 0; j < 6 - 1 - i; j++) {
				if (e[j].id > e[j + 1].id) {
					temp = e[j];
					e[j] = e[j + 1];
					e[j + 1] = temp;
					b = false;
				}
			}
			if (b) {
				System.out.println("Already Sorted");
				break;
			}
		}

	}

	void display() {
		System.out.println(eName + " ID:- " + id);
	}

}
