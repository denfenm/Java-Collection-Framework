import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class JavaCollectionFrameworkDemo {
	
	public static void main(String[] args)
	{
		
		ArrayList<String> l1 = new ArrayList(); 
		
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		
		System.out.println(l1);
		System.out.println(Collections.min(l1));
		
		
		
		HashMap<String, Integer> hmap = new HashMap();
		
		hmap.put("A", 1);
		hmap.put("B", 2);
		hmap.put("C", 3);
		hmap.put("D", 4);
		hmap.put("E", 5);
		
		System.out.println(Collections.min(hmap.values()));
		
		
		
	}

}