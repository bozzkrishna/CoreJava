package Inheritance.parentchild;

public class Audi extends Car{
	private String color,brand;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void light()
	{
		System.out.println("2 Light");
	}

}
