// Zorah Fung, CSE 142
// Some examples of using ArrayLists

import java.util.*;

// Translation from array to ArrayList:
//      String[]             ArrayList<String>
//      new String[n]        new ArrayList<String>()
//      list[i]              list.get(i)
//      list[i] = val        list.set(i, val);
//      list.length          list.size()
// New operations:
//      list.add(val)        appends val to list
//      list.add(i, val)     inserts val at index i shifting subsequent values to the right
//      list.remove(i)       removes and returns the value at i
//      list.clear()         clears the entire ArrayList


public class ArrayListExamples {
   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>();
      
      list.add("it's");
      list.add("friday");
      list.add("friday");
      list.add("gotta");
      list.add("get");
      list.add("down");
      list.add("on");
      list.add("thursday"); 
  
      list.set(7, "friday");
      
      System.out.println("length of the longest is " + maxLength(list));
      
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      
      numbers.add(30);
      numbers.add(20);
      numbers.add(10);
      numbers.add(60);
      numbers.add(50);
      numbers.add(40);
      
      
      mystery1(numbers);
      
      minToFront(numbers);
      
      System.out.println("numbers = " + numbers);
      
      removeEvenLength(list);
      
      System.out.println("list = " + list);
      
      stretch(list);
      
      System.out.println("list = " + list);
   }
   
    
   // Returns the length of the longest String in the given list
   public static int maxLength(ArrayList<String> list) {
      int max = 0;
      for (int i = 0; i < list.size(); i++) {
         if (max < list.get(i).length()) {
            max = list.get(i).length();
         }
      }
      return max;
   }
   
   // Moves the minimum value to the front of the given list, otherwise
   // preserving the order of the elements
   public static void minToFront(ArrayList<Integer> list) {
      int minIndex = 0;
      for (int i = 0; i < list.size(); i++) {
         if (list.get(i) < list.get(minIndex)) {
            minIndex = i;
         }
      }
      int val = list.remove(minIndex);
      list.add(0, val);
   }

   // Removes from the list all strings of even length
   public static void removeEvenLength(ArrayList<String> list) {
      for (int i = 0; i < list.size(); i++) {
         if (list.get(i).length() % 2 == 0) {
            list.remove(i);
            i--;
         } 
      }     
   }
 
   // Duplicates every value in the list
   // Note: We didn't do this in class but this method can be a bit tricky too!
   public static void stretch(ArrayList<String> list) {
      // Make sure we do i+= 2, otherwise you'll get an infinite loop 
      // (Try running it through the debugger)
      for (int i = 0; i < list.size(); i += 2) {
         String val = list.get(i);
         list.add(i, val);
      }
   }
   
   public static void mystery1(ArrayList<Integer> list) { //moves numbers to the front
	   for(int i = list.size() - 1; i > 0; i--) {
		   if (list.get(i) < list.get(i-1)) {
			   int element = list.get(i);
			   list.remove(i);
			   list.add(0,element); //add(int index, object element)
			   
		   }
	   }
	   System.out.println(list);
   }
}
