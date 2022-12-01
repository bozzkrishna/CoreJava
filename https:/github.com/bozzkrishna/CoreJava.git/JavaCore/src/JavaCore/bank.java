package JavaCore;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a=new Account();
		a.setAccid(1111);
		a.setAccname("Satham");
		a.setAccbalance(2400000.55f);
		
		Account b=new Account();
		b.setAccid(1112);
		b.setAccname("Thatchu");
		b.setAccbalance(1400000.95f);
		
		System.out.println("Account Detail :\t"+a.getAccname()+"\t"+a.getAccid()+"\t"+a.getAccbalance());
		System.out.println("Account Detail :\t"+b.getAccname()+"\t"+b.getAccid()+"\t"+b.getAccbalance());
	}

}
