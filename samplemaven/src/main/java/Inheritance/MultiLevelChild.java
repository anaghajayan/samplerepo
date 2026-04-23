package Inheritance;

public class MultiLevelChild extends MultiLevelParent{
	public void show()
	{
		System.out.println("this is multilevel child");
	}
	public static void main(String args[])
	{
		MultiLevelChild obj = new MultiLevelChild();
		obj.display();
		obj.print();
		obj.show();
	}

}
