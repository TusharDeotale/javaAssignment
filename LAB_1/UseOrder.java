package pgdacb;

public class UseOrder extends ShippedOrder {

	public static void main(String[] args) {
		ShippedOrder s = new ShippedOrder();
		s.setName("xyz");
		System.out.println(s.getName());
		s.setNum(14);
		System.out.println(s.getNum());
		s.setOrderQuant(5);
		System.out.println(s.getOrderQuant());
		s.setUnitCost(30);
		System.out.println(s.getUnitCost());

	}

}
