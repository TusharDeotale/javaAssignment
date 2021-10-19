package oops;

public class Square_Of_Num {

	double Square(double a) {
		return Math.pow(a, 2);
	}

	public static void main(String[] args) {
		Square_Of_Num sq = new Square_Of_Num();
		System.out.printf("%.0f %n"sq.Square(3));
		System.out.printf("%.2f %n"sq.Square(0.2));

	}

}
