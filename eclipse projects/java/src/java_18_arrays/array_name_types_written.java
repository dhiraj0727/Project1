package java_18_arrays;

import java.util.Arrays;

public class array_name_types_written {
	public static void main(String[] args) {
		
		String name[]= {"sdsd","dsdsds","adsdsds","zsdsd"};
		
//	System.out.println(name.length);
//	System.out.println(name[3]);
	
	for (int i = 0; i <= name.length-1; i++) {
		
		System.out.println(name[i]);
	}
	
//ascending ----->A-----Z
	
	System.out.println("ascending order is");
	
	Arrays.sort(name);// we are sorting array
for (int i = 0; i <= name.length-1; i++) {
		
		System.out.println(name[i]);
	}

//descending order
	System.out.println("descending order");
	
	for (int i = name.length-1;i>=0; i--) {
		System.out.println(name[i]);
		
	}
	
	
		
	}

}
