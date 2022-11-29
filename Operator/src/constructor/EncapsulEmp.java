package constructor;

public class EncapsulEmp {
	int id,sal;
	private String name,mail;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMail(String mail)
	{
		this.mail=mail;
	}
	public String getMail()
	{
		return mail;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulEmp obj=new EncapsulEmp();
		obj.setId(111);
		obj.setSal(100000);
		obj.setName("Jay");
		obj.setMail("jk@Gmail.com");
		System.out.println("ID :"+obj.getId()+"\nSalary :"+obj.getSal());
		System.out.println("Name :"+obj.getName()+"\nMail :"+obj.getMail());
	}

}
