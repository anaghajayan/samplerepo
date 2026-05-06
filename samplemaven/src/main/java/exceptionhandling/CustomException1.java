package exceptionhandling;

public class CustomException1 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		int age=9;
		if (age >=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new AgeException("age under 18!");
		}

	}

}
