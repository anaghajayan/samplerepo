package superkeyword;

public class SuperMethodChild extends SuperMethodParent{
	
	public void show()
	{
		System.out.println("this is the child super method");
		super.display();
	}

	public static void main(String[] args) {
		
		SuperMethodChild obj= new SuperMethodChild();
		obj.show();

	}

}
