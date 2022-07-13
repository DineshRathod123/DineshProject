package logical_program;

public class First4AndLast4_character {

	public static void main(String[] args)
	{
		String str="AutomationQuestions";
		String str1 = " ";
				
		if(str.length()>4)
		{
			
			str1=str.substring(str.length()-4);
		}
		else
		{
			
			str1=str;
		}
		System.out.println(str1);
		
		System.out.println("============");
		
		String ipl="AutomationQuestions ";
		
		String ipl1=" ";
		
		if(ipl.length()>4)
		{
			ipl1=ipl.substring(0,4);
		}
		else
		{
			ipl1=ipl1;
		}
		System.out.println(ipl1);
	}
	

}
