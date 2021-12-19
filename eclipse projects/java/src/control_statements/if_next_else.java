package control_statements;

public class if_next_else {

	public static void main(String[] args) {
		if_next_else d1 = new if_next_else();
			d1.next();
		
	}
	public void next() {
		String UN = "dhiraj";
		String pwd = "dhiraj@2707";
		
		if (UN=="dhiraj") // user name validation-----outer if else condition
		{
			
			System.out.println("un is "+UN);
			System.out.println("UN is correct, enter ur pwd");
			
		if (pwd=="dhiraj@2707") // pwd validation---------inner if else condition
		{
			System.out.println("pwd is "+pwd);
			System.out.println("pwd is correct");
		}
		else {
			System.out.println("pwd is incorrect try again later");
		}
			
		}
		else {
				System.out.println("UN is incorrect");
			}
	}

}
