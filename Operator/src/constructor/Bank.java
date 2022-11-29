package constructor;

public class Bank {
	int num;
	String mail;
	private int acno,balance;
	private String name;
	
	public void setAcno(int acno)
	{
		this.acno=acno;
	
	}
	public int getAcno()
	{
		return acno;
	}
	public void setMail(String mail)
	{
		this.mail=mail;
	
	}
	public String getMail()
	{
		return mail;
	}
	public void setNum(int num)
	{
		this.num=num;
	
	}
	public int getNum()
	{
		return num;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	
	}
	public int getBalance()
	{
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank c1=new Bank();
		c1.setAcno(7654321);
		c1.setMail("JK@gmail.com");
		c1.setBalance(899999);
		c1.setNum(737736566);
		System.out.println("AcNo :"+c1.getAcno()+"\nBalance :"+c1.getBalance());
		Bank c2=new Bank();
		c2.setAcno(76123451);
		c2.setMail("MK@gmail.com");
		c2.setBalance(999999);
		c2.setNum(838336566);
		System.out.println("AcNo :"+c2.getAcno()+"\nBalance :"+c2.getBalance());

	}

}
