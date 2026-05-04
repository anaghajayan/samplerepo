package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age=9;
		if (age >=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new ArithmeticException("age under 18!");
		}
		// TODO Auto-generated method stub

	}

}
