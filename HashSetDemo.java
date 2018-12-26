import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	
	public static void main(String[] args)
	{
		Set<String> set = new TreeSet<String>();
		set.add("London");	
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println("London".hashCode());
		System.out.println("Paris".hashCode());
		System.out.println("New York".hashCode());
		System.out.println("San Francisco".hashCode());
		System.out.println("Beijing".hashCode());
		System.out.println("New York".hashCode());
		
		
		System.out.println(set);
		
		for(String s: set)
		{
			System.out.print(s.toUpperCase()+" ");
		}
			
	}

}