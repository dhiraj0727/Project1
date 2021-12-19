package java_17_string;

public class sample1 {

	public static void main(String[] args) {

		String s="velocity"; // heap--->string pool--->constant pool area
							 // duplicate not allowed
		
		String s1 = "velocity";//duplicates allowed
		
		String s2 = new String("velocitY"); //heap--->string pool--->non constant pool area
		String s3 = new String("velocitY");
		String s4 = new String("velocity training");
		String s6 = new String ("pune");
		String s7 = new String ("punep");
		
		
		
		String s14 = "dhiraj";
		String s5 ="";
		
		System.out.println(s1==s14);
		System.out.println(s.length()); //Length
		
		System.out.println("---------------upper to lower to upper");
	    System.out.println(s.toUpperCase()); //lower to upper case
	    System.out.println(s.toLowerCase()); //upper to lower
	    
	    System.out.println("------compare");
	    System.out.println(s.equals(s2));
	    System.out.println(s.equals(s1));
	    
	    System.out.println(s.equalsIgnoreCase(s2));
	
	    System.out.println("----------contain");
	    System.out.println(s.contains(s3));
	    System.out.println(s.contains(s1));
	    
	    System.out.println("-----------empty or fulfilled");
	    System.out.println(s.isEmpty());
	    System.out.println(s5.isEmpty());
	    
	    System.out.println("-------character place no.-----");
	    System.out.println(s.charAt(7));
	    System.out.println(s.charAt(0));
	    
	    System.out.println("-------ends with/starts with----");
	    System.out.println(s.endsWith("city"));
	    System.out.println(s.startsWith("velo"));
	    System.out.println(s.startsWith("elo", 1));
	    
	    System.out.println("-------sub string-----");
	    System.out.println(s4.substring(8));
	    System.out.println(s4.substring(0, 8));
	    
	    System.out.println("---------combine 2 string add more info----------");
	    System.out.println(s4 . concat(s6));
	    System.out.println(s4.concat("pune is home"));
	    
	    System.out.println("---to check index");
	    System.out.println(s.indexOf('o'));
	    System.out.println(s7.indexOf("p"));
	    System.out.println(s7.lastIndexOf('p'));
	   
	    System.out.println("---------replace----");
	    System.out.println(s7.replace('p', 'm'));
	    System.out.println(s.replace('v', ' '));
	    System.out.println(s4.replaceAll( " ", "selenium"));
	    
	    System.out.println("--------divide-------");
	    
	    String[] spl=(s4.split(" "));
	    System.out.println(spl);
	    
	}
}
