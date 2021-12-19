package inheritance;

public class multi_level_inheritance {

	public static void main(String[] args) {
		
		son s= new son();
		s.mobile();
		s.bike();
		System.out.println("-----------from mother--------------");
		s.property();
		s.property1();
		System.out.println("------------from father-----------");
		s.savings();
		s.business();
	}
}
