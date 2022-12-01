package JavaCore;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book a=new Book();
		a.setBookid(1111);
		a.setBookname("Moner Secret");
		a.setBookprice(2400000.55f);
		
		Book b=new Book();
		b.setBookid(1112);
		b.setBookname("How To Talk");
		b.setBookprice(1400000.95f);
		
		System.out.println("Book Detail :\t"+a.getBookname()+"\t"+a.getBookid()+"\t"+a.getBookprice());
		System.out.println("Book Detail :\t"+b.getBookname()+"\t"+b.getBookid()+"\t"+b.getBookprice());
	}

}
