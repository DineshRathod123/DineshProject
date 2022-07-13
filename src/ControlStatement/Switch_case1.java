package ControlStatement;

public class Switch_case1 {

	public static void main(String[] args)
	{
		// A--->you got dist
		// B--->you got first class
		// C--->you got pass
		// D---->you got fail
		
		char grade='C';
		switch(grade)
	    { 
		case 'A':System.out.println("you got dist");
		break;
		
		case 'B':System.out.println("you got first class");
		break;
		
		case 'C':System.out.println("you got pass");
		break;
		
		case 'D':System.out.println("you got fail");
		break;
		
		default:System.out.println("plz inter grade between A-D");
		break;
		}

	}

}
