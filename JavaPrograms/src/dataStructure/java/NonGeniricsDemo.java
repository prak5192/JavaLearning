package dataStructure.java;

import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class NonGeniricsDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String []args){
		
		ArrayList list = new ArrayList();
		
		list.add("Prakash");
		list.add(new Integer(10));
		
		
		String name = (String)list.get(0);
		Integer number = (Integer)list.get(1);
		
		System.out.println(name);
		System.out.println(number);
		
	}

}
