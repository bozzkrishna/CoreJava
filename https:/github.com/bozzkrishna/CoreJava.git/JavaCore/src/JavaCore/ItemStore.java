package JavaCore;

public class ItemStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item a=new Item();
		a.setItemid(1111);
		a.setName("Moner Secret");
		a.setPrice(2400000.55f);
		
		Item b=new Item();
		b.setItemid(1112);
		b.setName("How To Talk");
		b.setPrice(1400000.95f);
		
		System.out.println("Item Detail :\t"+a.getName()+"\t"+a.getItemid()+"\t"+a.getPrice());
		System.out.println("Item Detail :\t"+b.getName()+"\t"+b.getItemid()+"\t"+b.getPrice());
	}

}
