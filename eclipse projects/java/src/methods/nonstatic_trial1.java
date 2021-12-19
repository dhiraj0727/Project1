package methods;

public class nonstatic_trial1 {
	

public static void main(String[] args) {
	
	System.out.println("im main method");
	
	// how to create object of class
	//class name-->object name=new-->class name();
	
	nonstatic_trial1 d=new nonstatic_trial1();
	
	// how to call non static method using object in same class
	// object name.methodname 
	d.demo();
	
	nonstatic_trial2 d2=new nonstatic_trial2();
	
	// how to call non static method using obj in diff class
	// object name.methodname
	d2.prac1();
	
}
public void demo()
{

System.out.println("im method ");

}

}
