package abstractStudy;

public abstract class AbstractClass 
{
	
	public void Sample()
	{
		System.out.println(" this is abstract class complete method");
		
	}
	
	public static void Sample2()
	{
		System.out.println(" this is static complete method");
		
	}
	
	public abstract void Sample3(); // this is abstract class incomplete method
	

	public static void main(String[] args)
	{
		Sample2();
		

	}

}
