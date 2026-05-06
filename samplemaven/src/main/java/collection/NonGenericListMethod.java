package collection;

import java.util.List;
import java.util.ArrayList;

public class NonGenericListMethod {

	public static void main(String[] args) {
		
		List a=new ArrayList();
		a.add("red");
		a.add(5);
		a.add(5.5f);
		a.add(123);
		a.add('c');
		System.out.println(a);
		
		System.out.println(a.get(2));
		System.out.println(a.size());
		
		a.set(4,'b');
		System.out.println(a);
		
		System.out.println(a.indexOf(123));
		System.out.println(a.lastIndexOf(5.5f));
		
		a.remove("red");
		System.out.println(a);
		
		a.remove(3);
		System.out.println(a);
		
		System.out.println(a.contains(5.5f));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a);
		System.out.println(a.size());
		
	}

}
