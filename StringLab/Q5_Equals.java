package string;

//Q 5. Write a Java program to check whether two 
//String objects contain the same data.
import java.util.Scanner;

public class Q5_Equals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s = sc.next();
		System.out.println("Enter 2nd String");
		String s1 = sc.next();
		if (s.equals(s1)) {
			System.out.println("Strings contains same data");
		} else {
			System.out.println("String does not contain same data");
		}
		sc.close();
	}

}
