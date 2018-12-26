import java.util.*;

public class HashMapDemo {
public static void main(String[] args) {
	//data structure tamau duplicates so i use set
	//one key mapping to dfferent values, 
	//two things, list of values (or one value) and one key
	//how to put value into map and traverse the map
	//it is a different set to javacollectionframework methods
	//data structures we are looking into is dynamic
	//one key refers to one value or many values
	//java collection framework stores objects 
	//autoboxing - take primitive value and convert to obj (5,6,7 will become integer objects instead of primitive data type)
	//difference between primitive data type and objects???
	/*
	 * primitive data type:
	 * int x;
	 * x is an integer variable
	 * value is stored in x
	 * 
	 * 
	 * double? meaans the class is Double (it is auto casted into obj) - AUTOBOXING
	 * 
	 * object:
	 * Integer x = new Integer(5);
	 * x is an integer object
	 * here we have x and a memory address which refers to the value of 5
	 */
	
	
	/*
	 * difference between hash map and tree
	 * tree arranges everything in ascending order
	 * hashmap stores everything in hash code
	 * thus the hashcode makes every obj unique
	 */
	
	//declaring the map
	Map<String, Integer> directory = new HashMap<String, Integer>();
	//my datatype is string
	
	
	
	
	
	//^^ one key to one value
	directory.put("Mum", 9998888); //in hashmap , mum is the key, and it uses put
	//what happens is mum points to vlue to 999888, 
	//can i put two same keys? no it cannot duplicate so it will update the value (look at bob)
	//key set can be anything, it can be integers as well
	directory.put("Dad", 9998888);
	directory.put("Bob", 12345678);
	directory.put("Edward", 553535);
	directory.put("Bob", 1000000);
	System.out.print(directory.size());
	
	/*
	 * key                              | value
	 * Mum									9998888
	 * Dad									9998888
	 * Bob									1000000
	 * Edward								5553535
	 */
	
	//traverse trhough a map
	//main identifier to separate the record is the key
	
	for(String key: directory.keySet()) //how to retrieve the key from map, store keys from directory into "key"
	{
		System.out.println(key + "'s number");
		System.out.println(directory.get(key)); //when i pass in the key, it will get the value
	} //sorts either it is a hashmap or treeset algorithm, 
	//exam: tree set is the order of output
	//exam: how to put them, how to retrieve and value for the key
	
	System.out.println(directory.values());
	
	
	
	
	
	//one key to multiple value
	Map<String, List<String>> CourseList = new HashMap<String, List<String>>();
	//to keep string values 
	//my map is called courselist
	
	
	List<String> OOP = new ArrayList<String>();
	OOP.add("Ali");
	OOP.add("Abu"); //these values i keep in a data struct called list
	
	List<String> DBS = new ArrayList<String>();
	DBS.add("Bubu");
	DBS.add("Ali");
	
	//put values inside the map
	CourseList.put("ITS1",OOP);
	CourseList.put("ITS2", DBS);
	
	//the size of the map is two
	
	
	System.out.println(CourseList.size());
	
	
	for(String x: CourseList.keySet()) {
		System.out.print(x+"'s number:");
		System.out.println(CourseList.get(x));
		
	//if i have the key in map, i check whether the key has shu en inside
		
		if(CourseList.containsKey("ITS1")) {
			System.out.println(CourseList.get("ITS1").contains("ShuEn"));
		} else {
			System.out.println("Course does not exist");
			
		}
		
		//lab 4 check if user is inside the map or not .
}
}
}
/*
 * import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {
	
	public static void main(String [] args)
	{
		Map <String,Integer> directory = new HashMap<String,Integer>();
		
		directory.put("Mum",9998888);
		directory.put("Dad", 9998888);
		directory.put("Bob",12345678);
		directory.put("Edward",5553535);
		directory.put("Bob",1000000);
		System.out.println(directory.size());
		
		for(String key :directory.keySet())
		{
			System.out.print(key+"'s number:");
			System.out.println(directory.get(key));
			
		}
		
		System.out.println(directory.values());
			
		
		
		
		
		
		
Map <String,List<String>> CourseList = new HashMap<String,List<String>>();

List <String> OOP1 = new ArrayList<String>();
List <String> Database= new ArrayList<String>();

Scanner input = new Scanner(System.in);
String name = input.nextLine();
 int value = input.nextInt();
 
 List <Integer> num = new ArrayList<Integer>(); 
 
 num.add(value);

OOP1.add(name);
OOP1.add("ShuEn");

Database.add("Christina");
Database.add("JQ");
CourseList.put("ITS61004",OOP1);
CourseList.put("ITS60303", Database);
		
		System.out.println(CourseList.size());
		
		for(String key :CourseList.keySet())
		{
			System.out.print(key+"'s number:");
			System.out.println(CourseList.get(key));
			
		}
		
		
			
		
	}

}*/
