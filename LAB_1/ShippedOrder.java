package pgdacb;

public class ShippedOrder extends NameOrder {

	private int charge = 40;

	double computePrice() {
		return (getOrderQuant() * getUnitCost()) + charge;
	}

}
