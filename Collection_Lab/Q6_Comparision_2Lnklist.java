package collectionAssignment;

import java.util.LinkedList;

public class Q6_Comparision_2Lnklist {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Red");
		l.add("Orange");
		l.add("Yellow");
		l.add("Green");
		l.add("Blue");
		l.add("Indigo");
		l.add("Violet");
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Violet");
		l1.add("Indigo");
		l1.add("Blue");
		l1.add("Green");
		l1.add("Yellow");
		l1.add("Orange");
		l1.add("Red");
		
		System.out.println(l1.contains(l));
	}
	

}
