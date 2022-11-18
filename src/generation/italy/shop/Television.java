package generation.italy.shop;

public class Television extends Product {
	
	private int height;
	private int width;
	private String isSmart;
	
	
	public Television(int code, String name, String brand, float price, int height, int width, String isSmart) {
		super(code, name, brand, price);
		
		this.height=height;
		this.isSmart=isSmart;
		this.width=width;

	}
	

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String isSmart() {
		return isSmart;
	}

	public void setSmart(String isSmart) {
		this.isSmart = isSmart;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\ncode:"+this.getCode()
				+ "\nname:"+this.getName()
				+ "\nbrand:"+this.getBrand()
				+ "\nprice:"+this.getPrice()
				+ "\ngetHeight:"+this.getHeight()
				+ "\ngetWidth:"+this.getWidth()
				+ "\nisSmart:"+this.isSmart();
	}
	
	
	
	
	

}
