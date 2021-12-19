package methods;

public class static_method_study {

	public static void main(String[] args)
	{
	
		
		System.out.println("hi i am main method..");
		
		mymethod();    // static method call from same class
		static_method_study1.mymethod(); // static method call from other class
										//classname.methodname
	} 


public static void mymethod()
{
	System.out.println("im static method");
}

}
