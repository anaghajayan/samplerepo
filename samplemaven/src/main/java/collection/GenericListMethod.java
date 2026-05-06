package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethod {

	public static void main(String[] args) {
		List <String> a=new ArrayList <String>();
		a.add("green");
		a.add("blue");
		a.add("red");
		a.add("green");
		System.out.println(a);
		// TODO Auto-generated method stub
		
		System.out.println(a.get(3));
		
		a.set(1,"white");
		System.out.println(a);
		
		System.out.println(a.indexOf("green"));
		System.out.println(a.indexOf("white"));
		
		System.out.println(a.lastIndexOf("red"));
		System.out.println(a.lastIndexOf("green"));
		
		//a.remove(3);
		//System.out.println(a);
		a.remove("green");
		System.out.println(a);
		
		System.out.println(a.contains("red"));
		System.out.println(a.contains("blue"));
		
		System.out.println(a.isEmpty());

		System.out.println(a.size());
		
		
		

	}

}
