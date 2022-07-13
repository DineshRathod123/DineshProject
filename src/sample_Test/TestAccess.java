package sample_Test;

import Specifiers_access.Amplitude;

public class TestAccess extends Amplitude
{

	public static void main(String[] args) 
	{
	    Amplitude a=new Amplitude();
	    a.force4();
	    
	    
	    // object should be created subclass
	    
	    TestAccess ts=new TestAccess();
	    ts.force3();
	    ts.force4();

	}

}
