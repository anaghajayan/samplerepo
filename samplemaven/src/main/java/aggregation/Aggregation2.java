package aggregation;

public class Aggregation2 {
	String city,state;
	Aggregation ref;
	public Aggregation2(String city,String state,Aggregation ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.name);
		System.out.println(ref.address);
		System.out.println(ref.rollno);
		System.out.println(city);
		System.out.println(state);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation obj=new Aggregation("Anagha",30,"1204");
		Aggregation2 obj1=new Aggregation2("jarfalla","Stockholm",obj);
		obj1.display();

	}

}
