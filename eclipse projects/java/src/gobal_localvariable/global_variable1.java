package gobal_localvariable;

public class global_variable1

{
	int a=20; // global variable
	int b=40; // global variable
	
	public static void main(String[] args)
	{
		global_variable1 d=new global_variable1();
		d.add();
		d.display();
	}
	
	public void add() {
		int sum = a+10;
		a=sum;
		System.out.println("modified value of a="+a);
		System.out.println("addition is "+sum);
		int addi = a+b;
		System.out.println("new addition is "+addi);
	}
	public void display() {
		
		int c = 5;         // local variable
		int sub = b-c;
		System.out.println("display method "+sub);
	}

}
