package basics;

public class Blackboard {
	private int size;
	private String color;
	private String brand;
	private String type;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}
	public String getType() {
		return type;
	}
}

