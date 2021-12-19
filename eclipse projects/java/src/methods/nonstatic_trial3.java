package methods;

public class nonstatic_trial3 
{
	public static void main(String[] args)
	{
		
		System.out.println("it is addition trial");
		addition();
		
	nonstatic_trial3 d=new nonstatic_trial3(); // creating object of class
    d.sub(); 						  // calling non static method from same class	
  d.division(300, 40);
 
	nonstatic_trial4 d2=new nonstatic_trial4();
	d2.multiply(100, 220);
		
	}

	public static void addition() // creating static method
	{
	
		int a =1;
		int b =20;
		int sum = a+b ;
		
		System.out.println("addition of 2 nos is " +sum);
		
	}
	
	public void sub() //creating non static method
	{
	int a = 50;
	int b = 30;
	int subs = a-b ;
		
	System.out.println("sub of 2 nos is "+ subs);
	
	}
	
	public void division(int a,int b) //creating non static method with parameters
	{
		
		int divide = a/b;
		
		System.out.println("division of 2 nos is " + divide );
		
		
	}
	}

