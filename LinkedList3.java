import java.util.LinkedList;
//Linked List Q3
public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> numlist = new LinkedList<Integer>();
		numlist.add(1);
		numlist.add(3);
		numlist.add(7);
		numlist.add(4);
		numlist.add(3);
		numlist.add(7);
		numlist.add(2);
		int num=6;
		System.out.println("Item Exist : "+ itemExist(numlist,num));
		
		deletefirst(numlist,7);
		System.out.println(numlist);
		
		deleteAll(numlist,7);
		System.out.println(numlist);
		
		countOccurance(numlist,7);
		System.out.println(countOccurance(numlist,3));	
		

	}
	
	public static boolean itemExist(LinkedList<Integer> numlist,int num)
	{
		boolean exist=false;
		if(numlist.contains(num))
			exist=true;
		else
			exist=false;
		
		return exist;
	}
	public static void deletefirst(LinkedList<Integer> numlist,Integer num)
	{
		
		numlist.remove(num);
	}
	
	public static void deleteAll(LinkedList<Integer> numlist,Integer num)
	{
	/*	for(Integer value : numlist)
		{
			if(value.equals(num))
				numlist.remove(value);
		}*/
		
		for(int i=0; i<numlist.size();i++)
		{
			numlist.remove(num);
		}
	
	}
	
	
	public static int countOccurance(LinkedList<Integer> numlist,Integer num)
	{
		int count=0;
		for(Integer value : numlist)
		{
			if(value.equals(num))
			{
				count++;
			}
		}
		return count;
	}
	
	
	public static void printlist (LinkedList<String> list) {
        System.out.println("In Method:");
        for(String str: list){
            System.out.println(str);
        }
     }

	
	

}