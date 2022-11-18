package generation.italy.shop;

public class Headphones extends Product{
	
	private String Color;
	private String areWireless;
	private String areCabled;
	
	public Headphones(int code, String name, String brand, float price, String Color, String areWireless, String areCabled) {
		
		super(code, name, brand, price);
		
		this.areCabled=areCabled;
		this.areWireless=areWireless;
		this.Color=Color;
	}
	
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getAreWireless() {
		return areWireless;
	}

	public void setAreWireless(String areWireless) {
		this.areWireless = areWireless;
	}

	public String getAreCabled() {
		return areCabled;
	}

	public void setAreCabled(String areCabled) {
		this.areCabled = areCabled;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\ncode:"+this.getCode()
				+ "\nname:"+this.getName()
				+ "\nbrand:"+this.getBrand()
				+ "\nprice:"+this.getPrice()
				+ "\nColor:"+this.getColor()
				+ "\nareWireless:"+this.getAreWireless()
				+ "\nareCabled:"+this.getAreCabled();
	}
}
