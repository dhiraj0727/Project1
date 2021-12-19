package access_specifiers;

public class access_specifiers {

	public void display() {
		System.out.println("im public display");
	}
	
	private void display1() {
		System.out.println("im private display"); // access only in same class
		
	}
	
	protected void display2() {
		
		System.out.println("im protected display");
		
	}
	
	void display3() {
		System.out.println("im default display");
	}

	public static void main(String[] args) 
	{
		access_specifiers d = new access_specifiers();
		d.display();  // public 
		d.display1(); // private calling only in same class
	}
}
