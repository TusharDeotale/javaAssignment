package oops;

public class SmallerNo {

	int smlNo(int a, int b) {
		if (a < b)
			return a;
		else
			return b;

	}

	float smlNo(float a, float b) {
		if (a < b)
			return a;
		else
			return b;

	}

	public static void main(String[] args) {
		SmallerNo sn = new SmallerNo();
		System.out.println(sn.smlNo(47, 66));
		System.out.println(sn.smlNo(7.3f, 7.2f));

	}

}

//Q 12 create an object of class .in case if user wish to store value to instance variable 
//so that should be possible .
//if he doesnot passes any value then variable should assigned zero 