package access_Modifier;

import AccessModifier.Revolution;

public class Revolution_Study extends Revolution  {

	public static void main(String[] args)
	{
	   
		Revolution R=new Revolution();
		R.sub();
		
		// object should be created by subclass
		
		Revolution_Study rs=new Revolution_Study();
		rs.sub();
		R.display();
		
		

	}

}
