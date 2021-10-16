package oops;

public class Square_Of_Num {

	double Square(double a) {
		return Math.pow(a, 2);
	}

	public static void main(String[] args) {
		Square_Of_Num sq = new Square_Of_Num();
		System.out.println(sq.Square(3));

	}

}
