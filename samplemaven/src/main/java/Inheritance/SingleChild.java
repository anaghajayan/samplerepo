package Inheritance;

public class SingleChild extends SingleParent {


	public void print()
	{
			System.out.println("this is the child class");
			
	}
	public static void main(String[] args)
	{
		SingleChild obj =new SingleChild();
		obj.print();
		obj.display();
	}
	}
	


