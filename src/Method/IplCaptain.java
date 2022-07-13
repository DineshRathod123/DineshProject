package Method;

public class IplCaptain {

	public static void main(String[] args) 
	{

		IplCaptain ipc=new IplCaptain();
		ipc.CaptainDetails("mumbai indians","rohit sharma", 350, 80, 78, 85.34564f);
		ipc.CaptainDetails("chennai king", "m s dhoni", 400, 80, 76, 75.4563754f);
		ipc.CaptainDetails("rajastan royals", "sanju", 450, 67, 70, 80.56743645f);
		
		

	}

	public void CaptainDetails( String name, String cname, int matches, int win, int losses, float percentage)
	{
		System.out.println("============================================");
		System.out.println("name-------> "+name);
		System.out.println("cname-------> "+cname);
		System.out.println("matches------> "+matches);
		System.out.println("win----------> "+win);
		System.out.println("losses--------> "+losses);
		System.out.println("percentage-----> "+percentage);
		System.out.println("==============================================");
		
	
	}
}
