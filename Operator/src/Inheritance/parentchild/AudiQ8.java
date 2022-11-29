package Inheritance.parentchild;

public class AudiQ8 extends Audi{
	private long price;
	private String eng,model;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	void warm()
	{
		System.out.println("Keeps Warm");
	}
	void wiper()
	{
		System.out.println("Automatic Wipers");
	}

}
