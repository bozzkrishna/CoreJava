package classandobjects;
import java.util.Scanner;

public class Theater {

	
	
			int id,contact;
			String name,rating;
			Theater()
			{
				id=-1;
				contact=-1;
				name="nnn";
				rating="cccc";
				
			}
			
			Theater(int id, String name,String rating,int contact)
			{
				this.id=id;
				this.name=name;
				this.rating=rating;
				this.contact=contact;
				
				
			}
			void show()
			{
				int a=0, b=0;
				System.out.println(a+" "+b);
				System.out.println(id+" "+name);
			}
			public String toString()
			{
				return id+" "+name+" "+rating+" "+contact;
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
//				System.out.println("Enter ID,contact,Name,rating");
//				int id=sc.nextInt();
//				int contact=sc.nextInt();
//				String name=sc.next();
//				String rating=sc.next();
//				Theater obj=new Theater(id,name,rating,contact);
//				System.out.println("Enter ID,contact,Name,rating");
//				id=sc.nextInt();
//				contact=sc.nextInt();
//				name=sc.next();
//				rating=sc.next();
//				Theater obj1=new Theater(id,name,rating,contact);
				for (int i=1; i<=3; i++)
				{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter ID,contact,Name,rating");
				int id=sc.nextInt();
				int contact=sc.nextInt();
				String name=sc.next();
				String rating=sc.next();
				Theater obj=new Theater(id,name,rating,contact);
				System.out.println(obj);
				}
			
				
				

			}

		


	}


