package control_statements;

public class else_if {

	public static void main(String[] args) {
		float marks = 54.99f;
		System.out.println("marks obtained "+marks);
	if(marks>=66.66) 
	{
		
		System.out.println("congratulation ,you got distinction");
	
	}
	else if (marks>=55) {
		System.out.println("congratulation, you got first class");
	}
	else if (marks>=35) {
		System.out.println("you are pass");
	}
	else {
		System.out.println("you are fail");
		}
	}

}
