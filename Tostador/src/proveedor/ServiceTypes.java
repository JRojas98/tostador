package proveedor;

public enum ServiceTypes {
	ELECTRICIDAD("electricidad", 100), 
	TELEFONIA("telefonia", 200), 
	OTROS("internet", 300);

	
	private final String name;
	private final double totalAmount;
	
	private ServiceTypes(String name,double totalAmount) {
		this.name = name;
		this.totalAmount = totalAmount;
	}
	
	public String  getName() {
		return name;
	}
	public double gettotalAmount() {
		return totalAmount;
	}
	
	
	
}
