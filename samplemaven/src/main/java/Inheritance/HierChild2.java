package Inheritance;

public class HierChild2 extends HierParent {
public void print()
	
	{
		System.out.println("this is the hierarchical child class 2");
	}
	public static void main(String args[])
	{
		HierChild2 obj= new HierChild2();
		obj.display();
		obj.print();
	}

}
