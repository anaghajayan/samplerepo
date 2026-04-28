package abstraction;

public class AbstractionChild extends AbstractionParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionChild obj=new AbstractionChild();
		obj.display();
		obj.print();
		

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("this is the detailed for abstract class which we given in the parent class ");
	}

}
