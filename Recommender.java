import java.util.*;

public class Recommender {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, LinkedList<String>> Likes = new HashMap<String, LinkedList<String>>();
		LinkedList<String> list = new LinkedList<String>();
		
		
		System.out.println("What is your name");
		String name = in.nextLine();
		String item;
		
		while(!name.equals(""))
		{
			System.out.println("Enter items that you like ");
			item = in.nextLine();
			while(!item.equals(""))
			{
				list.add(item);
				System.out.println("Enter items that you like ");
				item = in.nextLine();
			}
		Likes.put(name, list);
		System.out.println("Enter you name");
		name = in.nextLine();
		}
		System.out.println(Likes);
		
		
	}
	
	public boolean likesBoth(Map<String, LinkedList<String>> Likes, String name, String item, String item2) throws Exception 
	{
		
		if(Likes.get(name).equals(item)) {
			if(Likes.get(name).equals(item2)) {
				return true;
			}
		} else
			throw new Exception("NoPersonFound error");
		return false;
	}

	
}
