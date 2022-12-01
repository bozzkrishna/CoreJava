package JavaCore;

public class TeamP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		player a=new player();
		a.setPname("JK");
		a.setPid(111);
		a.setPachive(99);
		
		player b=new player();
		b.setPname("MK");
		b.setPid(112);
		b.setPachive(95);
		
		System.out.println("Player :\t"+a.getPname() +"\t"+ a.getPid() + "\t"+a.getPachive());
		System.out.println("Player :\t"+b.getPname() +"\t"+ b.getPid() + "\t"+b.getPachive());
	}

}
