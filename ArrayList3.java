import java.util.Arrays;

import javafx.css.Size;

import java.util.ArrayList;

public class ArrayList3 {
private Object length;
//bad thing about array list is that when adding value we have to add a space and push the other to the side. to solve that we have linked list
public static void main(String[] args) {
	//creating an array
	ArrayList<String> arrlist1 = new ArrayList<String>(3); 
	
	arrlist1.add("A");
	arrlist1.add("B");
	arrlist1.add("C");
	arrlist1.add("D");
	arrlist1.add("E");
	arrlist1.add("E");
	
	System.out.println(arrlist1);
	
	arrlist1.add(2, "G"); //second index
	System.out.println(arrlist1);
	arrlist1.remove("E"); //element, first occurence 
	System.out.println(arrlist1);
	arrlist1.remove(1); //index
	System.out.println(arrlist1);
	arrlist1.clear();
	
	arrlist1.add("A");
	arrlist1.add("B");
	arrlist1.add("C");
	arrlist1.add("D");
	arrlist1.add("E");
	arrlist1.add("E");
	//retrieve with specific index
	System.out.println(arrlist1.get(2));
	//sublist
	System.out.println(arrlist1.subList(2, 4));
	
	//create new array list fom sublist
	ArrayList<String> arraylist2 = new ArrayList<String>(arrlist1.subList(2, 4));
	System.out.println(arraylist2);
	
	String array[] = {"cat", "tiger", "cow"};
	///creating an arraylist from array(static)
	ArrayList<String> arraylist3 = new ArrayList <String> (Arrays.asList(array));
	System.out.println(arraylist3);
	
	//printing out values
	/*for(String value : arrlist1)  //for(int i = 0; i<length.arrlist1; i++) { String value = arrlist.get(i); System.out.println(value); }
	{
		System.out.println(value);
	}*/
	
	for(int i = 0; i< arrlist1.size(); i++) { String value = arrlist1.get(i); System.out.println(value); }
	
	//checking if array list has the value
	if(arraylist2.contains("S")) {
		System.out.print("Contain S");
	} else {
		System.out.println("Does not exist");
	}
	
	//Arraylist to array of object 
	
	Object array2[] = arraylist3.toArray();
	
	for(Object x: array2)
		System.out.println(x);
	
	arrlist1.add("A");
	arrlist1.add("B");
	arrlist1.add("C");
	arrlist1.add("D");
	arrlist1.add("E");
	arrlist1.add("E");
	
	for(int i = 0; i < arrlist1.size(); i++) 
	{arrlist1.remove("E");
	}
	System.out.println(arrlist1);
	}


}


