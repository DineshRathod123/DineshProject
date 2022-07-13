package abstractStudy;

public class ConcreteClass extends AbstractClass 
{
      public void demo()
      {
    	  System.out.println(" this is concrete class method");
      }
      @Override
    public void Sample3()
    {
    
    	System.out.println("sample3 is now complete in cc");
    }

	public static void main(String[] args)
	{
		ConcreteClass cc=new ConcreteClass();
		cc.Sample();
		AbstractClass.Sample2();
		cc.Sample3();
		cc.demo();

	}

}
