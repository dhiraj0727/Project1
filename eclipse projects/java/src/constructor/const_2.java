package constructor;

public class const_2 
{
	
	public static void main(String[] args) 
	{
	const_2 d=new const_2();
	d.display();
		
	}
	
	
	
	
	// example for user defined constructor
	

String city="Pune"; // variable declaration manually

//use of constructor ----> to initialize variable

String name; // variable declaration

public const_2() //user defined constructor without parameters

{
	name = "velocity"; // used to initialize variable
	
}
	
	

	public void display() 
	{
		
		System.out.println("im non static display method");
		System.out.println("my sity name is "+city);
		System.out.println("my name is "+name);
		
	}
}
