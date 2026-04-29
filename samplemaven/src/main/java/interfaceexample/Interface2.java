package interfaceexample;

public class Interface2 implements Interface1{
	public void show()
	{
		System.out.println("this is an interface2");
	}

	public static void main(String[] args) {
		Interface2 obj=new Interface2();
		obj.display();
		obj.print();
		obj.show();
		//Interface1 obj1=new Interface2();
		//obj1.display();
		//obj1.print();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() 
	{
		System.out.println("this is an example for display method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print()
	{
		System.out.println("this is an example for print method");
		// TODO Auto-generated method stub
		
	}

}
