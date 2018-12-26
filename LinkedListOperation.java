import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListOperation {
	
	public static void main(String[] args)
	{
		List<Integer> list = new LinkedList<Integer>();
		//list elements 1,4,2,5
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(5);
		
		System.out.println(list.contains(4));
		
		//write a  method to delete the first occurrence of an item from a linked list. 
		//So if the item is 7 and the list is [1,3,7,4,3,7,2], the result is [1,3,4,3,7,2].
		
		List<Integer> list2 = new LinkedList<Integer>();
		//list elements 1,4,2,5
		list2.add(1);
		list2.add(3);
		list2.add(7);
		list2.add(4);
		list2.add(3);
		list2.add(7);
		list2.add(2);
		
		((LinkedList)list2).removeFirstOccurrence(7);
		
		System.out.println(list2);
		
		
		
		List<Integer> list3 = new LinkedList<Integer>();
		//list elements 1,4,2,5
		list3.add(1);
		list3.add(3);
		list3.add(7);
		list3.add(4);
		list3.add(3);
		list3.add(7);
		list3.add(2);
		
	
	ListIterator<Integer> iterator = list3.listIterator();
	while(iterator.hasNext())
	{
		if(iterator.next()==7)
		{
			iterator.remove();
		}
	}
	System.out.println(list3);
	
	int count = Collections.frequency(list3, 3);
	
	System.out.println(count);
	
	
	
	/* Given an item and a linked list, write a method to return the position of the
	first occurrence of the item in the linked list, or -1 if it does not occur. 
	So if the item is 5 and the list is [2,4,5,8,1,5,3], the 
	result is 2 (using the Java convention that positions start at 0).*/
	
	List<Integer> list4 = new LinkedList<Integer>();
	
	list4.add(2);
	list4.add(4);
	list4.add(5);
	list4.add(8);
	list4.add(1);
	list4.add(5);
	list4.add(3);
	
	System.out.println(list4.indexOf(5));
	
	
	
	

	
	
	}
	
	

	
		
		

		
		
		
		
	
}
