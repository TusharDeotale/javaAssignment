package pgdacb;

import java.util.Scanner;

public class Stock {

	String stock_name, ord_stknme;
	int price;
	int qty;
	int ordqty, ordprc;

	public Stock() {

	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stock Name, Price & Quantity");
		stock_name = sc.next();
		price = sc.nextInt();
		qty = sc.nextInt();
	}

	void display() {
		System.out.println("Stock Name -> " + stock_name);
		System.out.println("Price -> " + price);
		System.out.println("Quantity -> " + qty);
	}

	void order(String stkName, int qty1) {
		ordprc = qty1 * 100;
		ordqty = qty1;
		ord_stknme = stkName;
		if (stock_name.equals(stkName)) {
			System.out.println("Item with name " + stkName + " is availabe.");
		} else {
			System.out.println(stkName + " is not available");
		}
		if (qty1 <= qty) {
			System.out.println("Order accepted. Item(s) are Availble.");
		} else
			System.out.println("Order rejected.");

	}

	void calculateDiscount() {
		int disprc;
		if (ordqty > 50 && ordprc > 10000) {
			disprc = ordprc - ((ordprc * 10) / 100);
			System.out.println("Discount on "+ordprc +" is " + disprc);
		} else {
			System.out.println("No Discount!!");
		}
	}

	String changeCase() {
		return ord_stknme.toUpperCase();
	}

}
