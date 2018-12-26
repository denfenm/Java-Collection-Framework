
import java.util.*;

public class TreeSetDemo {
public static void main(String[] args) {
Set<String>names=new TreeSet<String>();

names.add("james");
names.add("tinker");
names.add("bell");
System.out.println(names.size());
System.out.println(names);

names.add("tinker"); //ignores this value because it cannot duplicate
System.out.println(names);

names.remove("rabbit");
System.out.println(names);

for(String name: names) {
	System.out.println(name); 
	
	Iterator<String>iter = names.iterator();
	while(iter.hasNext()) {
		if(iter.next().equals("james")) 
			System.out.println("James Found");
	}
	}
}
}
/*
 * import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String [] args)
	{
		Set<String> names = new TreeSet<String>();
		names.add("james");
		names.add("tinker");
		names.add("bell");
		System.out.println(names.size());
		System.out.println(names);
		names.add("tinker");
		System.out.println(names);	
		names.remove("rabbit");
		System.out.println(names);	
		
		for (String name: names)
		{
			System.out.println(name);
		}
		Iterator<String> iter = names.iterator();
		while(iter.hasNext())
		{
			if(iter.next().equals("james"))
				System.out.println("James found");
		}
		
		
		
		
		
	}
	
	
}
 * */
