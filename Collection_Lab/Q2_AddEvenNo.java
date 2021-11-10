package collectionAssignment;

import java.util.Vector;

public class Q2_AddEvenNo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				v.add(i);
				System.out.println(i);
			}
		}
		System.out.println(v);
	}

}
