package ControlStatement;

public class SwitchCase {

	public static void main(String[] args)
	{
		// Monday---> this is 1st day of week
		// Tuesday---> this is 2nd day of week
		// Wednesday---> this is 3rd day of week
		// Thursday----> this is 4th day of week
		// Friday------> this is 5th day of week
		// Saturday----> this is 6th day of week
		// Sunday------> this is 7th day of week
		
		String day="Sunday";
		
		switch (day) 
		{
		case "Monday":System.out.println("first day of week");
	    break; 
	    
		case "Tuesday":System.out.println("second day of week");
		break;
		
		case "Wednesday":System.out.println("third day od week");
		break;
		
		case "Thurday":System.out.println("forth day of week");
		break;
		
		case "Friday":System.out.println("fifth day of week");
		break;
		
		case "Saturday":System.out.println("sixth day of week");
		break;
		
		case "Sunday":System.out.println("seventh day of week");
		break;
		

		default:System.out.println("plz enter a day between first-seven");
	    break;
	    
		}
		
		
	

	}

}
