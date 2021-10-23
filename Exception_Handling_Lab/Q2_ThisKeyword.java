package lab;

public class Q2_ThisKeyword {
	int a, b;
	String c;

	Q2_ThisKeyword(int a, int b) {
		this.a = a;
		this.b = b;
	}

	Q2_ThisKeyword(int a, int b, String c) {
		this(a, b);
		this.c = c;
		System.out.println(a + " " + b + " " + c);
	}

	public static void main(String[] args) {
		new Q2_ThisKeyword(1, 2, "abc");

	}

}
