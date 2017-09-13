package wikihow;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// Create a student and populate the fields.

		Student student = new Student("Bill", 20, 8, "No comments from me!");
		System.out.println("Before serialization:\n\t" + student.toString());

		// Serialization of the object.
		try {
			FileOutputStream file = new FileOutputStream("Archana.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(student);
			out.close();
			file.close();
		}

		catch (IOException ex) {
			ex.printStackTrace();
		}
		// Deserialization of the object.
		try {
			FileInputStream file = new FileInputStream("Archana.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			Student st = (Student) in.readObject();
			System.out.println("After serialization:\n\t" + st.toString());
			in.close();
			file.close();
		}

		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
