package lab;

import java.util.Scanner;

class NoDepartmentException extends Exception {
	NoDepartmentException() {
		super("Department Not Available!!");
		System.out.println("Enter valid department no.!!!");
	}

}

interface College {
	String name = "C-DAC NOIDA";
}

class Department implements College {
	int deptNo;
	String deptName;

	public void setValue(String deptName, int deptNo) {
		this.deptName = deptName;
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void getDeptNo() throws NoDepartmentException {
		if (deptNo == 10 || deptNo == 20 || deptNo == 30) {
			System.out.println("Entered value of department no. is valid");
		} else
			throw new NoDepartmentException();
	}
}

class Teacher extends Department {
	String name = "xyz";
	String qualification = "abc";

	void display() {
		System.out.println("Teacher Name: - " + name);
		System.out.println("Qualification: - " + qualification);
		System.out.println("Department Name: - " + deptName);
		System.out.println("Department No: - " + deptNo);
	}
}

public class Q8_Collage_Department_Teacher {

	public static void main(String[] args) throws NoDepartmentException {
		Teacher t = new Teacher();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department No: - ");
		int no = sc.nextInt();
		t.setValue("PgDac", no);

		try {
			t.getDeptNo();
			t.display();
		} finally {
			System.out.println("");
		}
	}

}
