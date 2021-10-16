package oops;

public class Cube_Of_Number {

	double Cube(double a) {
		return Math.pow(a, 3);
	}

	public static void main(String[] args) {
		Cube_Of_Number c = new Cube_Of_Number();
		System.out.println(c.Cube(2));

	}

}
