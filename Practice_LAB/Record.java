package pgdacb;

import java.util.Scanner;

public class Record {

	public static void main(String[] args) {
		Stock s = new Stock();
		s.input();
		s.display();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Stock Name and Quantity ");
		String stk = sc1.next();
		int qnty = sc1.nextInt();
		s.order(stk, qnty);
		s.calculateDiscount();
		System.out.println(s.changeCase());
		
		System.out.println();
		
		Stock s1 = new Stock();
		s1.input();
		s1.display();
		System.out.println("Enter the Stock Name and Quantity ");
		String stk1 = sc1.next();
		int qnty1 = sc1.nextInt();
		s1.order(stk1, qnty1);
		s1.calculateDiscount();
		System.out.println(s1.changeCase());

	}

}
