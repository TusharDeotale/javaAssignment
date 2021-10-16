package oops;

public class Function {

	int fun(int a) {
		return 2 * a;
	}

	int fun(int a, int b) {
		return 2 * a + 2 * b;
	}

	public static void main(String[] args) {
		Function f = new Function();
		System.out.println(f.fun(3));
		System.out.println(f.fun(3, 7));

	}

}
