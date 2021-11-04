package Core_Java_Classes_Constructor;

public class Q16_Toy {
	String toyName;
	int price;
	static String madeIn;

	public Q16_Toy() {
	}

	public Q16_Toy(String toyName, int price) {
		this.toyName = toyName;
		this.price = price;
		madeIn = "China";
	}

	static void staticDisplay() {
		System.out.println("Made in - " + madeIn);
	}

	void display() {
		System.out.println("Toy name is = " + toyName + " price is = " + price + "\n");
	}

	class Electronic {

		void printAll() {
			System.out.println("Toy name is " + toyName);
			System.out.println("Price is " + price);
			System.out.println("Made in " + madeIn + "\n");
			display();
			staticDisplay();

		}
	}

	public static void main(String[] args) {
		Q16_Toy t = new Q16_Toy("YO-YO", 800);
		t.display();
		Q16_Toy.staticDisplay();

		System.out.println("\n Electronic class");
		Q16_Toy.Electronic e = t.new Electronic();
		e.printAll();

	}

}
