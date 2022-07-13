package Specifiers_access;

public class Amplitude {

	public static void main(String[] args)
	{
		Amplitude a=new Amplitude();
		a.force1();
		a.force2();
		a.force3();
		a.force4();
		
	
	
	}
	private void force1()
	{
		System.out.println(" i am private method force1");
	}
	void force2()
	{
		System.out.println(" i am default method force2");
	}
	protected void force3()
	{
		System.out.println(" i am protected method force3");
	}
	public void force4()
	{
		System.out.println(" i am public method force4");
	}

}
