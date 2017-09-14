package RemoveDup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDup {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);

		// Remove elements smaller than 10 using
		// Iterator.remove()
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			int x = (Integer) itr.next();
			if (x < 10) {
				itr.remove();
			}
		}
		System.out.println("Modified ArrayList : " + al);
	}

}
