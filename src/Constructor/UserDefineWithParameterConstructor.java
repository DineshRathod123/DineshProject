package Constructor;

public class UserDefineWithParameterConstructor 
{
  
	int p;
	int q;
	int r;
	
	
	public UserDefineWithParameterConstructor(int x)
	{
		p=x;
		
	}
	public UserDefineWithParameterConstructor(int x, int y)
	{
		p=x;
		q=y;
		
	}
	public UserDefineWithParameterConstructor(int x, int y, int z)
	{
		p=x;
		q=y;
		r=z;
		
	}
	public static void main(String[] args)
	{
		

		UserDefineWithParameterConstructor udc1=new UserDefineWithParameterConstructor(25);
		udc1.add();
		
		UserDefineWithParameterConstructor udc2=new UserDefineWithParameterConstructor(25,35);
		udc2.add();
		
		UserDefineWithParameterConstructor udc3=new UserDefineWithParameterConstructor(25,35,45);
		udc3.add();
		
		

	}
	public void mul()
	{
		int mul=p*q*r;
		System.out.println("the multiplication is "+mul);
	}
	public void add()
	{     
		int add=p+q+r;
		System.out.println(" the addition is "+add);
	}

}
