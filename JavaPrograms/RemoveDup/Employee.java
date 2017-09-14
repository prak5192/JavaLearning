package RemoveDup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {

	String name;
	long phone = 8884854962L;// Add a capital L to the end:Otherwise, the
								// compiler will try to parse the literal as an
								// int, hence the error message

	public Employee(String name, long phone) {
		this.name = name;
		this.phone = phone;
	}

	public static void main(String[] args) {

		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Archana", 8884854962L));
		al.add(new Employee("Prakash", 9590357352L));
		al.add(new Employee("Rajiv", 9590357352L));

		Iterator<Employee> itr = al.iterator();
		while (itr.hasNext()) {
			Employee emp = (Employee) itr.next();
			if (emp.phone == 9590357352L) {
				itr.remove();
			}

		}
		for(Employee emp:al){
			System.out.println(emp.name+" "+emp.phone);
		}
	}

}
