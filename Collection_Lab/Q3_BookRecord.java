package collectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;

class BookLib {
	int id;
	String bName;

	public BookLib(int id, String bName) {
		super();
		this.id = id;
		this.bName = bName;
	}

	@Override
	public String toString() {
		return "Booklib [id = " + id + ",\tbName = " + bName + "]";
	}

}

public class Q3_BookRecord {

	public static void main(String[] args) {
		ArrayList<BookLib> b = new ArrayList<BookLib>();
		b.add(new BookLib(001, "Walking Dead"));
		b.add(new BookLib(010, "Fear The Walking Dead"));
		b.add(new BookLib(011, "Death Note"));
		b.add(new BookLib(100, "Game Of Throne"));
		b.add(new BookLib(101, "Dark"));

		Iterator<BookLib> i = b.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
