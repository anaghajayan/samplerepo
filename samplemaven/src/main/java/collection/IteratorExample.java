package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> a= new HashSet <String>();
		a.add("red");
		a.add("blue");
		a.add("orange");
		a.add("black");
		System.out.println(a);
		
		Iterator i= a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(a);

	}

}
