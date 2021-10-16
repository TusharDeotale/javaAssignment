package oops;

public class Polymorphism {

	void add(int a, int b) {
		System.out.println("Adding 'a' and 'b' = " + (a + b));

	}

	void add(int a, int b, int c) {
		System.out.println("Adding 'a', 'b' and 'c' = " + (a + b + c));

	}

	void add(int a, int b, int c, int d) {
		System.out.println("Adding 'a', 'b', 'c', and 'd' = " + (a + b + c + d));

	}

	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.add(1, 2);
		p.add(1, 2, 3);
		p.add(1, 2, 3, 4);

	}

}
