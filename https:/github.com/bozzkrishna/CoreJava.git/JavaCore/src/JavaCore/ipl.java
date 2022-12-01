package JavaCore;

public class ipl
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		team csk=new team();
		csk.setTeamName("CSK");
		csk.setTeamCapt("Dhoni");
		csk.setTeamSize(11);
		csk.setTeamAchive(4);
		
		team mi=new team();
		mi.setTeamName("MI");
		mi.setTeamCapt("Rohit");
		mi.setTeamSize(13);
		mi.setTeamAchive(3);
		
		System.out.println("Team Name : \t"+csk.getTeamName());
		System.out.println("Team Capt : \t"+ csk.getTeamCapt());
		System.out.println("Team Size : \t"+ csk.getTeamSize());
		System.out.println("Team Achive : \t"+ csk.getTeamAchive());
		System.out.println(" ");
		System.out.println("Team Name : \t" +mi.getTeamName());
		System.out.println("Team Capt : \t"+ mi.getTeamCapt());
		System.out.println("Team Size : \t"+ mi.getTeamSize());
		System.out.println("Team Achive : \t"+mi.getTeamAchive());
	}
	
}
