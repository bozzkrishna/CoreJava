package Inheritance.parentchild;

public class Patient extends Person {
	public String id,disease,bedno;

	void display()
	{
		System.out.println("Patien :");
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getBedno() {
		return bedno;
	}

	public void setBedno(String bedno) {
		this.bedno = bedno;
	}

}
