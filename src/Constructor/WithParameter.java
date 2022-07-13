package Constructor;

public class WithParameter
{    
	int a;
	int b;
	int c;
	
	public WithParameter(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
		System.out.println( a+b+c);
	}

	public static void main(String[] args)
 
	{
		WithParameter obj=new WithParameter(20, 30, 40);
			obj.add();	
		
	}
	public void add()
	{
		int add=a+b+c;
		System.out.println("the addition is "+add);
	}

}
