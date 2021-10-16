package oops;

public class StudentRecord {

	String sName;
	int roll_no;
	
	StudentRecord(String sName, int roll_no){
		this.sName = sName;
		this.roll_no = roll_no;
	}
	
	void display() {
		System.out.println(this.sName);
		System.out.println(this.roll_no);
	}
	public static void main(String[] args) {

		StudentRecord s = new StudentRecord("John", 2);
		s.display();
	}

}
