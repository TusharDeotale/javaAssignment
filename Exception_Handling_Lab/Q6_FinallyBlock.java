package lab;

public class Q6_FinallyBlock {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		try {
			int c = a/b;
			System.out.println("The value of c = "+c);
		}
		finally {
			System.out.println("Check inputs");
		}
	}

}
