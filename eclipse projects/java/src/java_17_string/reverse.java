package java_17_string;

public class reverse {

	public static void main(String[] args) {
		String p = "dhiraj";
		String d = "";
		
		String s = "raddar";
		String r ="";
		
		
		System.out.println(p.length());
		
		for (int i = p.length()-1;i>=0;i--) // 7 6 5 4 3 2 1 0
		{
		
			d=d+p.charAt(i); //dhiraj
			
			r=r+s.charAt(i); //radar
		}
		System.out.println("given string is "+p);
		System.out.println("reverse string is "+d);
		
		System.out.println("given string is "+s);
		System.out.println("reverse string is "+r);
		
		if(s.equals(r))
		{
		System.out.println("given string is palindrome");
		
		}
		else {
			System.out.println("is not palidrome");
		}
		
	//mom------.palindrome
	//dad
		
		
		
		
	}

}
