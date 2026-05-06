package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> a= new HashSet <String> ();
		a.add("yellow");
		a.add("blue");
		a.add("pink");
		a.add("red");
		System.out.println(a);
		
		Set <String> b= new HashSet <String> ();
		b.add("white");
		b.add("black");
		System.out.println(b);
		
		a.addAll(b);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.contains("white"));
		System.out.println(b.contains("blue"));
		
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.remove("blue"));
		System.out.println(a);
		
		b.removeAll(a);
		//a.removeAll(b);
		System.out.println(b);
		
		System.out.println(a.size());
		System.out.println(b.size());
		
		a.clear();
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
