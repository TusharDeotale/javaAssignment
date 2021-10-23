package lab;

@SuppressWarnings("serial")
class SpeedLimitException extends Exception {
	SpeedLimitException() {
		super("Speed Limit Violation has Accursed!!");
		System.out.println("Speed Limit Violation has Accursed!!");
	}
}

interface Vehicle1 {
	void set_speed(int s) throws SpeedLimitException;

}

class Trucks implements Vehicle1 {

	public void set_speed(int a) throws SpeedLimitException {
		if (a > 100) {
			throw new SpeedLimitException();
		} else
			System.out.println("Good to go.");
	}

}

class Submarines implements Vehicle1 {
	int s1;

	public void set_speed(int s) {
		s1 = s;
	}

	int getSpeed() {
		return s1;
	}

}

public class Q3_VehicleTypes {

	public static void main(String[] args) throws SpeedLimitException {
		Trucks t = new Trucks();
		// t.set_speed(200);

		try {
			t.set_speed(200);
		} catch (SpeedLimitException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.toString());
		} finally {
			System.out.println("Check speed");
		}

		Submarines ss = new Submarines();
		ss.set_speed(89);
		System.out.println("Submarine Speed is "+ss.getSpeed());

	}

}
