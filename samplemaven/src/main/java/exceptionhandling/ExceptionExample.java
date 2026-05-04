package exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException e)
		
		{
			b=2;
			int c=a/b;
			System.out.println(c);
			System.out.println(e);
		}
		finally
		{
		System.out.println("mandatory code");
		}
	}

}
