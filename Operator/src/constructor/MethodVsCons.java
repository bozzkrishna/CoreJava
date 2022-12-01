package constructor;

	
	public class MethodVsCons {
		   int num;
		   MethodVsCons(){
		      num = 3;
		      System.out.println("Constructor invoked. num: " + num);
		   }
		   public void init(){
		      num = 5;
		      System.out.println("Method invoked. num: " + num);
		   }
		   public static void main(String args[]) {
		      MethodVsCons tester = new MethodVsCons();
		      tester.init();
		   }
		}



