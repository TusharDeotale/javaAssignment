package oops;

public class EmployeeRecord {

	public static void main(String[] args) {
		Employee e1[] = new Employee[6];
		for (int i = 0; i < 6; i++) {
			e1[i] = new Employee();
			e1[i].setData();
		}

		e1[0].sort(e1);

		for (int j = 0; j < 6; j++) {
			e1[j].display();
		}

	}

}
