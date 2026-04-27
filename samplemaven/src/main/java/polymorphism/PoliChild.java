package polymorphism;

public class PoliChild extends PoliParent{
	public void display()
	{
		System.out.println("child class");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoliChild obj= new PoliChild();
		obj.display();

	}

}
