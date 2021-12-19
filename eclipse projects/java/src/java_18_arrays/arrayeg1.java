package java_18_arrays;

public class arrayeg1 {

	public static void main(String[] args) {
		
		//velocity training centre ----> string
		//roll no---> int
		//grade ---> char
		//age----> float
		
	//1. Array declaration with capacity
		String name[]=new String [5];
		
	//2. Array initialization
		
		name[0]="velocity";
		name[1]="corporate";
		name[2]="training";
		name[3]="centre";
		name[4]="pune";
		
	//3. Array usage
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		
		System.out.println("-------------------"+name.length+"---------------------");
		
		for(int i= 0;i<=4;i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("---------------------------------------");
		for (int i = 0;i<=name.length-1;i++)
			
		{
			System.out.println(name[i]);
		}
		


		
	}

	
	
	
	
	
	
	
	
	
	
	
}
