package JavaGeneral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo{

	public static void main(String [] args){
		Student obj1 = new Student("Prakash", 80);
		Student obj2 = new Student("Ranjan", 81);
		Student obj3 = new Student("Prakash", 83);
		Student obj4 = new Student("Archana", 80);
		Student obj5 = new Student("Shona", 84);
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(obj1);
		studentList.add(obj2);
		studentList.add(obj3);
		studentList.add(obj4);
		studentList.add(obj5);
		
		Collections.sort(studentList,new Student());
        for(Student str: studentList){
	       	System.out.println(str.name + " " + str.marks);
	    }
	}
}

class Student implements Comparator<Student>{
	public String name;
	public int marks;
	
	Student(){}
	
	Student(String name, int marks ){
		this.name = name;
		this.marks = marks;
	}

	public int compare(Student obj1, Student obj2) {
		int flag = obj1.marks - obj2.marks;
		
		if(flag == 0){
			flag = obj1.name.compareTo(obj2.name);
		}
		
		return flag;
	}
}
