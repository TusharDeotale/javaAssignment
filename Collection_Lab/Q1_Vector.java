package collectionAssignment;

import java.util.Iterator;
import java.util.Vector;

public class Q1_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		// Adding element to the vector
		v.add("Tushar");
		v.add("Rajat");
		v.add("Sanket");
		System.out.println(v + "\n");

		Iterator<String> i = v.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("\nHashcode " + v.hashCode());

		System.out.println("\nElement at '2' is " + v.get(2));

		System.out.println("\nSize of vector = " + v.size() + "\tCapacity of vector = " + v.capacity());

		v.add(null);
		System.out.println("\n" + v);

		System.out.println("\nIndex value of null element is = " + v.indexOf(null));

		v.add(1, "Chetan");
		System.out.println("\n" + v);

		v.insertElementAt("Yash", 2);
		System.out.println("\n" + v);

		v.remove(5);
		System.out.println("\n" + v);

		v.remove("Rajat");
		System.out.println(v);

	}

}
