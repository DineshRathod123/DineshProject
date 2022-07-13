package logical_program;

public class ReverseOfString {

	public static void main(String[] args) 
	{
		String name="BAYBREEZ";
		
		int st= name.length();
		String rev=" ";
		
		for(int a=st-1; a>=0; a--)
		{
			rev=rev+name.charAt(a);
		}
		System.out.println("Reverse of "+name+" is"+rev);
		
		System.out.println("======================");
		
		String name1="1234";
		
		int it=name1.length()-1;
		String rev1=" ";
		
		for(int b=it; b>=0; b--)
		{
			rev1=rev1+name1.charAt(b);
		}
		System.out.println("Reverse of "+name1+" is"+rev1);
		
		

	}

}
