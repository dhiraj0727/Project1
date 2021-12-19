package java_18_arrays;

public class arrayeg2 {

	public static void main(String[] args) {

	//declaration
		int rollno[]=new int[4];
		
	//initialization
		rollno[0]=500;
		rollno[1]=400;
		rollno[2]=300;
		rollno[3]=100;

	//usage
		
		for (int i =0;i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);
		}
		
	}

}
