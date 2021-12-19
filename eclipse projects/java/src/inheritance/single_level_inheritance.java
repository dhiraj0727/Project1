package inheritance;

public class single_level_inheritance {
public static void main(String[] args) {
	System.out.println("................................");
	mother p = new mother();
	p.property();
	p.property1();
	
	
	System.out.println("--------------------------------------");
	son s = new son();
	s.mobile();
	s.bike();
	s.property();
	s.property1();
	
}
}

