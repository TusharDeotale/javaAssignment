 package fileInputOutput;

import java.io.*;

public class Q1_Employee {
	String name;
	int age;
	float salary;
	void getData() throws IOException {
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		System.out.println("Enter Employee Name, Age and Salary  =");
		name = b.readLine();
		age = Integer.parseInt(b.readLine());
		salary = Float.parseFloat(b.readLine());
	}
	
	void check() {
		if(salary>20000) {
			salary += ((float) (salary*0.1));
		}
		else {
			salary += ((float) (salary*0.15));
		}
	}
	
	void display() {
		System.out.println("Employee Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Salary = "+salary);
	}

}
