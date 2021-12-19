package constructor;

public class const_3 {
	// example for user defined constructor with parameters
	
	int a;
	int b;
	int c;
	
	public const_3() //user defined without parameter  constructor
	{
		a=10;
		b=30;
		c=50;
	}
	
	
	public const_3(int d) //user defined with single parameter constructor
	
	{
		
		a=d;
	}
	
	public const_3( int e ,int f) // user defined with 2 parameters
	{
	a=e;
	b=f;
	}
	
	public const_3(int g,int h,int i) // user defined with 2 parameters
	{
		a=g;
		b=h;
		c=i;
	}
	
	public void addition() // non static
	{
		int sum = a+b+c;
		System.out.println("addition is "+sum);
		
		
	}
	
	public static void main(String[] args) 
	
	{
		
		const_3 d=new const_3();//object created with default value zero
		d.addition();
		const_3 d1 = new const_3(200); // obj created with some value
		d1.addition();
		const_3 d3 = new const_3(50,40);
		d3.addition();
		const_3 d4 = new const_3(100,222,224);
		d4.addition();
	}
	
	

}
