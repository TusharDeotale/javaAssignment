package Core_Java_Classes_Constructor;

import java.util.Scanner;

public class Q6_Employee {
	static int salary;
	int hours;

	void getInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary and number of working hours per day");
		salary = sc.nextInt();
		hours = sc.nextInt();
		sc.close();
	}

	void addWork() {
		if (hours > 6)
			salary += 5000;
	}

	void addSal() {
		if (salary < 50000) {
			salary += 10000;
		}
	}

	public static void main(String[] args) {
		Q6_Employee e = new Q6_Employee();
		e.getInfo();
		e.addSal();
		e.addWork();
		System.out.println("Updated Salary is = " + salary);
	}

}
