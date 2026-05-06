package collection;

import java.util.HashSet;

public class NonGenericSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet a= new HashSet();
		a.add("pink");
		a.add(123);
		a.add(5.5f);
		
		HashSet b= new HashSet();
		b.add('c');
		b.add(1234567l);
		b.add(1234.567d);
		
		System.out.println(a);
		System.out.println(b);
		
		a.addAll(b);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.contains(123));
		
		System.out.println(a.containsAll(b));

		System.out.println(b.containsAll(a));
		
		System.out.println(a.isEmpty());
		
		a.remove(123);
		System.out.println(a);
		System.out.println(b);
		
		a.removeAll(b);
		b.removeAll(a);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.size());
		System.out.println(b.size());
		
		a.clear();
		b.clear();
		System.out.println(a);
		System.out.println(b);
		

	}

}
