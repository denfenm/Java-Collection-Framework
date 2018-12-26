import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.*;

public class HashMapStudent {
	public static void main(String[] args) throws Exception {
	//declare scanner obj
		Scanner in = new Scanner(System.in);
		
	//store sutdent id and modules taken in a hashmap
	Map<String, LinkedList<String>> mapList = new HashMap<String, LinkedList<String>>();
	//map is parent
	//declare linked list obj
	LinkedList<String> modules;
	
	
	System.out.println("Enter your student ID");
	String studentID = in.nextLine();
	String modulename;
	while(!studentID.equals(""))
	{
		modules = new LinkedList<String>();
		System.out.println("Please enter the modules you have taken this semester");
		modulename = in.nextLine();
		while(!modulename.equals("")) 
				{
					modules.add(modulename);
					System.out.println("Please enter the modules you have taken this semester");
					modulename = in.nextLine();
				}
	
	
	mapList.put(studentID, modules);
	System.out.println("Enter your student ID");
	studentID = in.nextLine();
	}
	System.out.println(mapList);
}
}
