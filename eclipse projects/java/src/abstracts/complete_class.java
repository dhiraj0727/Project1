package abstracts;



public class complete_class extends incomplete_method 
{

	public static void main(String[] args) 
	{
		complete_class b = new complete_class();
			b.test();
			b.test2();
			b.test1(); //abstract method call
			b.test3();
			
			
	}
	@Override
	
	public void test1() // abstract method defn from abstract class
	{
		System.out.println("------------------abstract method definantion here------------------");
		System.out.println("i am abstract from abstract method");
	}
	
	public void test3()
	{
		System.out.println("i am complete method froom concrete class");
	}

}
