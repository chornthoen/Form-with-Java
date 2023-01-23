package order_product;

public class OrderProduct {
	private String code;
	private String name;
	private int qty;
	private double unitprice;
	private double discount;
	

	public OrderProduct() {
		this("a001","ABC",100,2,0.1);
	
	}


	public OrderProduct(String code, String name, int qty, double unitprice, double discount) {
		super();
		this.code = code;
		this.name = name;
		this.qty = qty;
		this.unitprice = unitprice;
		this.discount = discount;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public double getUnitprice() {
		return unitprice;
	}


	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getPrice() {
		return getQty() * getUnitprice();
	}
	public double getDiscountAmount() {
		return getPrice() * getDiscount();
	}
	public double getNetprice() {
		return getPrice()-getDiscountAmount();
	}
	public String toString() {
	return getCode()+"  "+getName()+"     "+getQty()+"     "+getUnitprice()+"    "+
	       getPrice()+"    "+getDiscountAmount()+"    "+getNetprice()+"\n";
	}
	

}
