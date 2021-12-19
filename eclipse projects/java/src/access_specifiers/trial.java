package access_specifiers;

public class trial {

	public static void main(String[] args) {
		
		access_specifiers d = new access_specifiers();
		d.display(); //public in all packages
//		d.display1(); // private not accessible only for  class
		d.display2(); // only in package and used outside using inheritance
		d.display3(); // default in same package only
 
	}

}
