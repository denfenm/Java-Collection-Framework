// This class contains solutions to the sample ArrayList problems discussed
// in lecture.  It contains some client code that calls the various methods.

// translation from array to ArrayList:
//    String[]          => ArrayList<String>
//    new String[10]    => new ArrayList<String>()
//    a.length          => list.size()
//    a[i]              => list.get(i)
//    a[i] = value;     => list.set(i, value);
// new operations:
//     list.remove(i);     --remove the ith value
//     list.add(value);    --appends a value
//     list.add(i, value); --adds at an index
//     list.clear()        --remove all value

import java.util.*;

public class ArrayListSamples {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("we're");
        list.add("off");
        list.add("to");
        list.add("see");
        list.add("the");
        list.add("wizard");
        list.add("the");
        list.add("fabulous");
        list.add("wizard");
        list.add("of");
        list.add("Oz");
        System.out.println("list = " + list);
        list.remove(7);
        list.add(7, "wonderful");
        // could have been list.set(7, "Wonderful");
        System.out.println("list = " + list);

        System.out.println("maxLength returns " + maxLength(list));

        stutter(list);
        System.out.println("after stutter list = " + list);

        removeEvenLength(list);
        System.out.println("after removeEvenLength list = " + list);

        removeDuplicates(list);
        System.out.println("after removeDuplicates list = " + list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(8);
        list2.add(92);
        list2.add(4);
        list2.add(2);
        list2.add(17);
        list2.add(9);

        System.out.println("list2 = " + list2);
        minToFront(list2);
        System.out.println("after minToFront list2 = " + list2);
    }

    // returns the length of the longest String in the given list
    public static int maxLength(ArrayList<String> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }

    // moves the minimum value to the front of the given list, otherwise
    // preserving the order of the elements
    public static void minToFront(ArrayList<Integer> list) {
        int min = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(min)) {
                min = i;
            }
        }
        int oldValue = list.remove(min);
        list.add(0, oldValue);
        // could also have been written in one line:
        // list.add(0, list.remove(min));
    }

    // removes from the list all strings of even length
    public static void removeEvenLength(ArrayList<String> list) {
        int i = 0;
        while (i < list.size()) {
            String s = list.get(i);
            if (s.length() % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

    // replaces every value in the list with two of that value
    public static void stutter(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            String s = list.get(i);
            list.add(i, s);
        }
    }


    // removes duplicate values from the list assuming that the list is in
    // sorted order to begin with
    public static void removeDuplicates(ArrayList<String> list) {
        int index = 0;
        while (index < list.size() - 1) {
            if (list.get(index).equals(list.get(index + 1))) {
                list.remove(index + 1);
            } else {
                index++;
            }
        }
    }
}

