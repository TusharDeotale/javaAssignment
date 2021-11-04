package Core_Java_Classes_Constructor;

public class Q1_Constructor {
	int id;
	String name;
	
	public Q1_Constructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		System.out.println("ID: - "+this.id+"\t Name: - "+this.name);
	}

	public static void main(String[] args) {
		Q1_Constructor obj1 = new Q1_Constructor(23, "Tushar");
		Q1_Constructor obj2 = new Q1_Constructor(24, "Rajat");
	}

}
