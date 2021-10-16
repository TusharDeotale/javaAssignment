package pgdacb;

public class NameOrder {

	private String cname;
	private int cnum;
	private int oquant;
	private double untcst;

	void setName(String cname) {
		this.cname = cname;
	}

	String getName() {
		return cname;
	}

	void setNum(int cnum) {
		this.cnum = cnum;
	}

	int getNum() {
		return cnum;
	}

	void setOrderQuant(int oquant) {
		this.oquant = oquant;
	}

	int getOrderQuant() {
		return oquant;
	}

	void setUnitCost(double untcst) {
		this.untcst = untcst;
	}

	double getUnitCost() {
		return untcst;
	}

	double computePrice() {
		return oquant * untcst;
	}

}
