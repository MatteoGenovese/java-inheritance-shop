package generation.italy.shop;

public class Smartphone extends Product {
	
	private String IMEICode;

	public Smartphone(int code, String name, String brand, float price, String IMEICode) {
		super(code, name, brand, price);
		
		this.IMEICode=IMEICode;
	}
	
	public String getIMEICode() {
		return IMEICode;
	}

	public void setIMEICode(String iMEICode) {
		IMEICode = iMEICode;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\ncode:"+this.getCode()
				+ "\nname:"+this.getName()
				+ "\nbrand:"+this.getBrand()
				+ "\nprice:"+this.getPrice()
				+ "\ngetIMEICode:"+this.getIMEICode();
	}
}
