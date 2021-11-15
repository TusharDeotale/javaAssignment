package string;

//Q 4. Write a Java program to compare two strings lexicographically, 
//ignoring case differences.
public class Q4_IgnoreCase {

	public static void main(String[] args) {
		System.out.println("dog".compareToIgnoreCase("DOG"));
		System.out.println("CAT".compareToIgnoreCase("cat"));
		System.out.println("aPPle".compareToIgnoreCase("apple"));
		System.out.println("PgDaC".compareToIgnoreCase("pGdAc"));
	}

}
