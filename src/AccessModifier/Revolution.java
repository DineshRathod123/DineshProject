package AccessModifier;

public class Revolution {
	
	int a=10;
	private int b=20;
	public int c=30;
	protected static int d=40;
	
			

	public static void main(String[] args) 
	{
		Revolution R=new Revolution();
		R.add();
        R.sub();
        R.mul();
        display();
	}
	private void add()
	{
		int sum=a+b+c+d;
		System.out.println("addition is "+sum);
	}
	public void sub()
	{
		int sub=d-b;
		System.out.println("the subtraction is "+sub);
	}
	void mul()
	{
		
		int mul=a*b*c*d;
		System.out.println(" the multi is "+mul);
	}
	protected static void display()
	{
		System.out.println(" hi am protected static method");
	}
	
	
	 

}
