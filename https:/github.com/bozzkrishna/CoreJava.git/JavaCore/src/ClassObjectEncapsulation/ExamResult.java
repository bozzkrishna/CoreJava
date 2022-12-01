package ClassObjectEncapsulation;

public class ExamResult {
	
	
	public void annualResult(Semester s1, Semester s2)
	{
		
		int phyt=(s1.phy+s2.phy);
				System.out.println("Total Phy :" + phyt);

		int matt=(s1.mat+s2.mat);
				System.out.println("Total mat :" + matt);
		
		int chet=(s1.che+s2.che);
				System.out.println("Total Phy :" + chet);
				
		float tper=((phyt+matt+chet)/6);
				System.out.println("Percentage :"+tper);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Semester s1=new Semester();
		s1.acceptDetails("Jay", 11001, 88, 99, 77);
		s1.showDetails();
		
		Semester s2=new Semester();
		s2.acceptDetails("Jay", 11001, 98, 88, 87);
		s2.showDetails();
		
		ExamResult e=new ExamResult();
		e.annualResult(s1, s2);
		
		
	}

}
