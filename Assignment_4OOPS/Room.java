package oops;

public class Room {

	int roomno, roomarea;
	String roomtype;
	boolean acMachine;

	void setData() {
		roomno = 1;
		roomarea = 200;
		roomtype = "Delux";
		acMachine = true;
	}

	void display() {
		System.out.println(roomno);
		System.out.println(roomarea);
		System.out.println(roomtype);
		if(acMachine)
		System.out.println("ac is availabel");
	}

	public static void main(String[] args) {

		Room r = new Room();
		r.setData();
		r.display();

	}

}
