package collectionAssignment;

import java.util.Comparator;
import java.util.PriorityQueue;

class Ticket {
	int id, priorityNo;
	String description;

	public Ticket(int id, int priorityNo, String description) {
		super();
		this.id = id;
		this.priorityNo = priorityNo;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", priorityNo=" + priorityNo + ", description=" + description + "]";
	}

}

class TicketComparator implements Comparator<Ticket> {

	@Override
	public int compare(Ticket o1, Ticket o2) {
		return o1.priorityNo - o2.priorityNo;
	}

}

public class Q4_HelpDesk {

	public static void main(String[] args) {

		PriorityQueue<Ticket> p = new PriorityQueue<Ticket>(new TicketComparator());
		p.add(new Ticket(12345, 5, "bugs in the app"));
		p.add(new Ticket(24680, 2, "money has not been recived"));
		p.add(new Ticket(13579, 4, "unable to login"));
		p.add(new Ticket(23579, 3, "unable to transfer money"));
		p.add(new Ticket(54321, 1, "account has been hacked"));
		
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		
	}

}
