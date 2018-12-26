import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListDemo {
public static void main(String[] args) {
	
	LinkedList<String> listarr1 = new LinkedList<String>();
	
	listarr1.add("Diana");
	listarr1.add("Harry");
	listarr1.add("Romeo");
	listarr1.add("Tom");
	
	System.out.println("#1"+listarr1);
	
	ListIterator<String> iterator = listarr1.listIterator();
	iterator.next(); //DIHRT
	iterator.next(); //DIHRT
	iterator.add("Juliet");
	iterator.add("Nina"); 
	
	System.out.println("#2"+listarr1);
	
iterator.next();
iterator.remove();
System.out.println("#3"+listarr1);

while(iterator.hasNext()) //moving forward in the list whether there is next element
{
	System.out.println("Moving Next"+iterator.next());
	
}

while(iterator.hasPrevious()) //moving backwards in the list
{
	System.out.println("Moving back"+iterator.previous());
}
}
}
