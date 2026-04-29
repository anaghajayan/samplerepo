package Inheritance;

public class MultipleChild implements MultipleParent1,MultipleParent2
{
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MultipleChild obj= new MultipleChild();
		obj.Print();
		obj.Show();

	}

	@Override
	public void Print() 
	{
		System.out.println("this is print method example");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Show() {
		System.out.println("this is show method example");
		// TODO Auto-generated method stub
		
	}

}
