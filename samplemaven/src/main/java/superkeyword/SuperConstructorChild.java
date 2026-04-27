package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	
	public SuperConstructorChild()
	{
		super(5,4);
		System.out.println("this is the child super constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj= new SuperConstructorChild();
		
				

	}

}
