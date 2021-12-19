package inheritance;

public class hierarchical_inheritance 
{
public static void main(String[] args) {
	
	son n = new son();
	
	n.bike();
	n.mobile();
	n.property();
	n.property1();
	n.savings();
	n.business();
	
	System.out.println("-----------------");
	
	daughter d=new daughter();
	d.laptop();
	d.jwellery();
	d.property();
	d.property1();
	d.savings();
	d.business();
	
}

}
