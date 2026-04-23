package Inheritance;

public class HierChild1 extends HierParent{
	public void print()
	
	{
		System.out.println("this is the hierarchical child class 1");
	}
	public static void main(String args[])
	{
		HierChild1 obj= new HierChild1();
		obj.display();
		obj.print();
	}

}
