package JavaGeneral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnModifiableList {

	public static void main(String[] argv) throws Exception
    {
         List<String> stuff = new ArrayList<String>();
         stuff.add("Archana");
         stuff.add("Prakash");
         List<String> list = Collections.unmodifiableList(stuff);
         
         Set<String> set = new HashSet<String>(stuff);
         set = Collections.unmodifiableSet(set);
         
         System.out.println("Collection is read-only now.");
      }
	
}
